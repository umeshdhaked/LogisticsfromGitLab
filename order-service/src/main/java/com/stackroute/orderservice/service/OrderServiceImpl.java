package com.stackroute.orderservice.service;

import com.google.gson.Gson;
import com.stackroute.orderservice.domain.DateDemand;
import com.stackroute.orderservice.domain.Order;
import com.stackroute.orderservice.domain.TimeSlot;

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
import org.springframework.kafka.annotation.KafkaListener;
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
    private DateDemand[] dateDemandsDummy = {new DateDemand(
            "2019-12-01", new TimeSlot("11:00-13:00", 100), new TimeSlot("14:00-16:00", 20), new TimeSlot("17:00-19:00", 50)
    )};

    //Actual Kafka
    @Value("${kafka.bootstrap.servers}")
    private String kafkaBootstrapServers;
    private Properties producerProperties;
    private KafkaProducer<String, String> producer;
    @Value("${kafka.topic.new_order}")
    private String newOrderTopicName;

    private DateDemand[] dateDemands;
    //listener
    @KafkaListener(topics = "vehicle_slots", groupId = "foo")
    public void listen(String message) {
        System.out.println("Received Message in group foo: " + message);
        Gson gson = new Gson();
        dateDemands = gson.fromJson(message, DateDemand[].class);
        System.out.println(dateDemands[0].toString());
    }

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
    public DateDemand checkSlotAvailability(String deliveryDate) throws ParseException {
        //Use dummy message and parse it
        //Change this once actual rent service works
        for(DateDemand date: dateDemandsDummy){
            if(date.getDate().equals(deliveryDate)){
                return date;
            }
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
