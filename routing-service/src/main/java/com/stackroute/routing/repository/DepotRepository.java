package com.stackroute.routing.repository;

import com.stackroute.routing.domain.Depot;
import com.stackroute.routing.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepotRepository extends MongoRepository<Depot,Integer> {

    @Query("{depotId : ?0}")
    Depot findByDepotId(String depotId);


}
