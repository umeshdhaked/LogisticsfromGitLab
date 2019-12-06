package com.stackroute.vehicledemand.repository;

import com.stackroute.vehicledemand.domain.acceptedRetailerRequest;
import com.stackroute.vehicledemand.domain.newRetailerDemand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface AcceptedRetailerDemandRepository extends MongoRepository<acceptedRetailerRequest, BigInteger> {
<<<<<<< HEAD
    public List<acceptedRetailerRequest> findByRetailerIdAndSlot(int retailerId,String slot);
=======
    public List<acceptedRetailerRequest> findByRetailerId(int retailerId);
>>>>>>> 668337944932b95726739813fb93331f7945b754
}
