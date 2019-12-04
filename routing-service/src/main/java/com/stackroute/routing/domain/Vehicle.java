package com.stackroute.routing.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.concurrent.atomic.AtomicInteger;


@Document
@Data
public class Vehicle {

    @Id
    int id ;
    String vehicleNumber;
//    String vehicleName;
//    String phoneNumber;
//    String vehicleType;
    long capacity;
//    String costPerSlot;
//    String address;
}
