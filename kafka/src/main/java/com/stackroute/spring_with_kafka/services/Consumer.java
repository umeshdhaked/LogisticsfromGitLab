package com.stackroute.spring_with_kafka.services;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import java.util.*;

import java.io.IOException;

@Service
public class Consumer {


    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users", groupId = "group_1")
    public void consume(String message) throws IOException {
        logger.info(String.format("$$ -> Consume 1 message -> %s", message));
        this.display();
    }
    @KafkaListener(topics = "users", groupId = "group_2")
    public void consumed(String message) throws IOException {
        logger.info(String.format("$$ -> Consumed 2 message -> %s", message));
    }
    public void display(){


        Properties props=new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("auto.offset.reset", "earliest");
        props.put("group.id", UUID.randomUUID().toString());
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);

        consumer.subscribe(Arrays.asList("users"));

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);

            for (ConsumerRecord<String, String> record : records)
                System.out.println(record.offset() + " plus: " + record.value());
        }
    }
}
