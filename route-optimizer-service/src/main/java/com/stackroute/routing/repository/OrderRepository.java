package com.stackroute.routing.repository;

import com.stackroute.routing.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {


    @Query("{orderId : ?0}")
    Order findByOrderId(int orderId);


}

