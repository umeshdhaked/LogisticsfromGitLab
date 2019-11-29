package com.stackroute.BackEnd.repository;

import com.stackroute.BackEnd.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VehicleRepository extends MongoRepository<Vehicle, Integer> {

    List<Vehicle> findByVehicleNumber(String vehicleNumber);

    List<Vehicle> findBySlot1StatusAndDateAndVehicleType(String slot1Status, String date,String vehicleType);


    List<Vehicle> findBySlot2StatusAndDateAndVehicleType(String slot2Status, String date,String vehicleType);

    List<Vehicle> findBySlot3StatusAndDateAndVehicleType(String slot3Status, String date,String vehicleType);
}
