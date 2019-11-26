package com.stackroute.orderservice.service;

import com.google.gson.Gson;
import com.stackroute.orderservice.domain.Order;
import com.stackroute.orderservice.domain.TimeSlot;
import com.stackroute.orderservice.repository.ConsumerRepository;
import com.stackroute.orderservice.repository.OrderRepository;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    //Properties dependent on Message Bus
    private String slotsResponse =
            "{\"TimeSlots\":[{\"Date\": \"2019-12-21\", \"Slot1\": \"40\", \"Slot2\": \"30\", \"Slot3\":\"10\"}, " +
                    "{\"Date\": \"2019-12-20\", \"Slot1\": \"41\", \"Slot2\": \"90\", \"Slot3\":\"20\"}]}"; //Message fetched from Driver company

    //Actual Kafka
    @Value("${kafka.bootstrap.servers}")
    private String kafkaBootstrapServers;
    private Properties producerProperties;
    private KafkaProducer<String, String> producer;
    @Value("${kafka.topic.new_order}")
    private String newOrderTopicName;
    @Autowired
    private ConsumerRepository consumerRepository;

    //method to send messages
    private static void sendKafkaMessage(String payload,
                                         KafkaProducer<String, String> producer,
                                         String topic)
    {
        System.out.println("Sending Kafka message: " + payload);
        producer.send(new ProducerRecord<>(topic, payload));
    }

    private void assignProducerProperties(){
        /*
         * Defining producer properties.
         */
        producerProperties = new Properties();
        producerProperties.put("bootstrap.servers", kafkaBootstrapServers);
        producerProperties.put("acks", "all");
        producerProperties.put("retries", 0);
        producerProperties.put("batch.size", 16384);
        producerProperties.put("linger.ms", 1);
        producerProperties.put("buffer.memory", 33554432);
        producerProperties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producerProperties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<>(producerProperties);
    }



    @Override
    public Order searchOrder(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order saveOrder(Order order) {
//        System.out.println(order.toString());

        Order order1 = orderRepository.saveOrders(order);
        //activeOrder = order1.toString();
        Gson gson = new Gson();
        String json = gson.toJson(order1);
        assignProducerProperties();
        sendKafkaMessage(json, producer, newOrderTopicName);
        return order1;
    }

    @Override
    public TimeSlot checkSlotAvailability(String deliveryDate) throws ParseException {
        System.out.println(this.consumerRepository.findAll());
        //Use dummy message and parse it
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject)jsonParser.parse(slotsResponse);

        JSONArray dates = (JSONArray) jsonObject.get("TimeSlots");

        JSONObject jsonSlot = null;

        for(int i = 0; i < dates.size(); i++){
            JSONObject current = (JSONObject)dates.get(i);
            if(current.get("Date").equals(deliveryDate)){
                System.out.println(current);
                jsonSlot = current;
                break;
            }
        }
        //Check which slots have enough volume and add
        if(jsonSlot != null) {
            TimeSlot timeSlot = new TimeSlot();
            timeSlot.setDate(deliveryDate);
            timeSlot.setSlot1(Double.parseDouble(jsonSlot.get("Slot1").toString()));
            timeSlot.setSlot2(Double.parseDouble(jsonSlot.get("Slot2").toString()));
            timeSlot.setSlot3(Double.parseDouble(jsonSlot.get("Slot3").toString()));
            return timeSlot;
        }
        return null;

    }

    @Override
    public List<Order> findOrdersByDateAndTimeSlot(String date, String timeslot) {
        return orderRepository.findByDeliveryDateAndSlotNumber(date, timeslot);
    }

    @Override
    public List<Order> findOrderByStatus(String orderStatus) {
        return orderRepository.findByOrderStatus(orderStatus);
    }
}
