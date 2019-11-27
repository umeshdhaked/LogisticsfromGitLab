package com.stackroute.vehicledemand.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.stackroute.vehicledemand.domain.DateDemand;
import com.stackroute.vehicledemand.domain.TimeSlot;
import com.stackroute.vehicledemand.domain.retailerdemand;
import com.stackroute.vehicledemand.repository.vehicledemandrepository;
import com.stackroute.vehicledemand.service.vehicledemandservice;
//import netscape.javascript.JSObject;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class retailervehicledemandcontroller {
    //Kafka Properties
    @Value("${kafka.bootstrap.servers}")
    private String kafkaBootstrapServers;
    private Properties producerProperties;
    private KafkaProducer<String, String> producer;
    @Value("${kafka.topic.vehicle_slots}")
    private String vehicleSlotsTopicName;

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

    private static void sendKafkaMessage(String payload,
                                         KafkaProducer<String, String> producer,
                                         String topic)
    {
        System.out.println("Sending Kafka message: " + payload);
        producer.send(new ProducerRecord<>(topic, payload));
    }

    @Autowired
    public vehicledemandservice vehicledemandservice;
//    @Autowired
//    public retailervehicledemandcontroller(vehicledemandservice vehicledemandservice){
//        this.vehicledemandservice=vehicledemandservice;
//    }


    @PostMapping(value = "/save", consumes = "application/json")
    public ResponseEntity savenewretailerdemand(@RequestBody retailerdemand retailerdemand) {
//        retailerdemand x = new retailerdemand();
//        x = retailerdemand;
//        System.out.println(x.getTimeSlot());
//        System.out.println(x.getDate());
//        System.out.println(x.getVolume());

        ResponseEntity responseEntity;
        try {
            vehicledemandservice.savenewvehicledemand(retailerdemand);
            //Hard coded to get dateDemand
            DateDemand[] dateDemandsDummy = {new DateDemand(
                    "2019-12-01", new TimeSlot("11:00-13:00", 100), new TimeSlot("14:00-16:00", 20), new TimeSlot("17:00-19:00", 50)
            )};
            toJson(dateDemandsDummy);
            responseEntity = new ResponseEntity<>("Successfully created", HttpStatus.CREATED);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<>("get some sense", HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }


    public void toJson(DateDemand[] dateDemands){
        //send to kafka topic
        Gson gson = new Gson();
        String json = gson.toJson(dateDemands);
        assignProducerProperties();
        sendKafkaMessage(json, producer, vehicleSlotsTopicName);
        //return json;
    }

}
