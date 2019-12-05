package com.stackroute.vehicledemand.repository;

import com.stackroute.vehicledemand.domain.newRetailerDemand;
import com.stackroute.vehicledemand.domain.retailerdemand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface newRetailerDemandRepository extends MongoRepository<newRetailerDemand, BigInteger> {
}
