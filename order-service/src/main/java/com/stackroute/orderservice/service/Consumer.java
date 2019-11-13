package com.stackroute.orderservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.io.IOException;

public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private String slotsMessage;

    public String getSlotsMessage() {
        return slotsMessage;
    }

    @KafkaListener(topics = "slots", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
        this.slotsMessage = message;
    }
}
