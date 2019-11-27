package com.techprimers.security.jwtsecurity.repository;

import com.techprimers.security.jwtsecurity.model.Retailer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailerRepository extends CrudRepository<Retailer,Long> {

    public Retailer findRetailerByEmail(String email);


}
