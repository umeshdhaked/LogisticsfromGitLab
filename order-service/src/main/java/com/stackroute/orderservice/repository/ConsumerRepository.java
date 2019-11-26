package com.stackroute.orderservice.repository;

import com.stackroute.orderservice.domain.TimeSlot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends CrudRepository<TimeSlot, Integer> {
}
