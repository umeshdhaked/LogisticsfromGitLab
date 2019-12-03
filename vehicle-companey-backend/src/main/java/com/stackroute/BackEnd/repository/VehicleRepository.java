package com.stackroute.BackEnd.repository;

import com.stackroute.BackEnd.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface VehicleRepository extends MongoRepository<Vehicle, Integer> {

    
//   @Query("{'date': ?0,'slot': ?1,''}")
//   public List<Vehicle> findbydateslotandstatus(String date,String slot,String status);



    List<Vehicle> findByVehicleNumber(String vehicleNumber);

    List<Vehicle> findBySlot1StatusAndDateAndVehicleType(String slot1Status, String date,String vehicleType);


    List<Vehicle> findBySlot2StatusAndDateAndVehicleType(String slot2Status, String date,String vehicleType);

    List<Vehicle> findBySlot3StatusAndDateAndVehicleType(String slot3Status, String date,String vehicleType);
}
