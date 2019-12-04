package com.stackroute.routing.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.concurrent.atomic.AtomicInteger;


@Document
@Data
public class Vehicle {
    private static final AtomicInteger counter = new AtomicInteger();

    public static int nextValue() {
        return counter.getAndIncrement();
    }


    @Id
    int id =nextValue();
    String vehicleNumber;
//    String vehicleName;
//    String phoneNumber;
//    String vehicleType;
    long capacity;
//    String costPerSlot;
//    String address;
}
