package com.stackroute.routing.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@Document
@Data
public class Order {
    private static final AtomicInteger counter = new AtomicInteger();

    public static int nextValue() {
        return counter.getAndIncrement();
    }


    @Id
    private int id =nextValue();
    private int wholesalerId;
    private int orderId ;
//    private String customerName;
    private String customerAddress;
//    private String customerPhoneNumber;
    private Date deliveryDate;
    private int slotNumber;
    private long orderVolume;
}

