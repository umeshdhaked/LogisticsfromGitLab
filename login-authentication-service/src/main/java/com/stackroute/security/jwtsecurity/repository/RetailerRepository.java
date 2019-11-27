package com.stackroute.security.jwtsecurity.repository;

import com.stackroute.security.jwtsecurity.model.Retailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailerRepository extends CrudRepository<Retailer,Long> {

    public Retailer findRetailerByEmail(String email);


}
