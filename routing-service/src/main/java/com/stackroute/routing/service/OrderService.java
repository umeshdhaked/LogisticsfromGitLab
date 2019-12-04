package com.stackroute.routing.service;

import com.stackroute.routing.domain.Order;
import com.stackroute.routing.repository.OrderRepository;
import org.springframework.stereotype.Service;

public interface OrderService {


    public Order addOrder(Order order) throws Exception;

    public Order deleteOrder(int orderId) throws Exception;

}
