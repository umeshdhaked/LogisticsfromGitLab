package com.stackroute.orderservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    private int _id;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String deliveryDate;
    private String slotNumber;
    private Double orderVolume;

}
