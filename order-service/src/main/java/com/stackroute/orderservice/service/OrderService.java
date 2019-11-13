package com.stackroute.orderservice.service;

import com.stackroute.orderservice.domain.Order;
import com.stackroute.orderservice.domain.TimeSlot;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public interface OrderService {
    public Order searchOrder(int _id);

    public List<Order> getAllOrders();

    //Should produce to active_orders topic
    public Order saveOrder(Order order);

    //Should consume from time_slots topic
    public TimeSlot checkSlotAvailability(String deliveryDate, double orderVolume) throws ParseException;

}
