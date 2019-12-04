package com.stackroute.routing.service;

import com.stackroute.routing.domain.Order;
import com.stackroute.routing.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order addOrder(Order order) throws Exception {
        if(orderRepository.findByOrderId(order.getOrderId())!=null)
            throw  new Exception("order already exists");
        return orderRepository.save(order);
    }

    @Override
    public Order deleteOrder(int orderId) throws Exception {

        Order order =orderRepository.findByOrderId(orderId);
        if(order!=null)
            orderRepository.delete(order);
        else
            throw new Exception("record not found to be deleted");

        return orderRepository.findByOrderId(orderId);
    }
}
