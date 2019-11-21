package com.stackroute.orderservice.repository;

import com.stackroute.orderservice.domain.Order;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends Neo4jRepository<Order , Integer> {

    @Query("CREATE (o:Order{order}) return o;")
    Order saveOrders(@Param("order") Order order);

    Order findById(@Param("id") Long id);

    List<Order> findByDeliveryDateAndSlotNumber(@Param("deliveryDate") String date, @Param("slotNumber") String slotNumber);
}
