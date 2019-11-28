package com.stackroute.repo;

import com.stackroute.domain.RetailerProfile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetailerProfileRepository extends CrudRepository<RetailerProfile, Integer> {

    public RetailerProfile findRetailerProfileByEmail(String email);


}
