package com.stackroute.vehicledemand.repository;

import com.stackroute.vehicledemand.domain.acceptedRetailerRequest;
import com.stackroute.vehicledemand.domain.newRetailerDemand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface AcceptedRetailerDemandRepository extends MongoRepository<acceptedRetailerRequest, BigInteger> {
}
