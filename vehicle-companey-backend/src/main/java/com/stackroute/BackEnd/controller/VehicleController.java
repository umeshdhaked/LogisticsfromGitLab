package com.stackroute.BackEnd.controller;

import com.stackroute.BackEnd.domain.Vehicle;
import com.stackroute.BackEnd.exception.VehicleAlreadyExistsException;
import com.stackroute.BackEnd.exception.VehicleNotFoundException;
import com.stackroute.BackEnd.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/api/v1")
public class VehicleController<VehicleDao> {

    VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {

        this.vehicleService = vehicleService;
    }

    @PostMapping("vehicle")

    @CrossOrigin
    public ResponseEntity<?> saveVehicle(@RequestBody Vehicle vehicle) throws VehicleAlreadyExistsException {

        System.out.println("values");

        System.out.println("id = "+vehicle.getId());
        System.out.println(vehicle.toString());

//        vehicle.setDate("today");

        vehicle.setSlot1Status("Available");
        vehicle.setSlot2Status("Available");
        vehicle.setSlot3Status("Available");


        ResponseEntity responseEntity;
        //try {
        vehicleService.saveVehicle(vehicle);
        responseEntity = new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);
        //}
        //catch (Exception ex){
        //  responseEntity=new ResponseEntity<String>(ex.getMessage(),HttpStatus.CONFLICT);
        //}
        return responseEntity;
    }

    @GetMapping("vehicle")
    @CrossOrigin
    public ResponseEntity<?> getVehicles() {
        ResponseEntity responseEntity;
        List<Vehicle> vehicles = vehicleService.getVehicles();
        //try{
        responseEntity = new ResponseEntity<>(vehicles, HttpStatus.OK);
        //}catch (Exception ex) {
        //  responseEntity = new ResponseEntity(ex.getMessage(),HttpStatus.CONFLICT);
        //}
        return responseEntity;
    }

    @GetMapping("vehicles")
    @CrossOrigin
    public ResponseEntity<?> getAllVehicles() {
        ResponseEntity responseEntity;
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        //try{
        responseEntity = new ResponseEntity<>(vehicles, HttpStatus.OK);
        //}catch (Exception ex) {
        //  responseEntity = new ResponseEntity(ex.getMessage(),HttpStatus.CONFLICT);
        //}
        return responseEntity;
    }


    @GetMapping("vehicle/{id}")
    public ResponseEntity<?> getVehicleById(@PathVariable int id) throws VehicleNotFoundException {
        ResponseEntity responseEntity;
        // try{
        responseEntity = new ResponseEntity<Optional<Vehicle>>(vehicleService.getVehicleById(id), HttpStatus.CREATED);
        //}catch (TrackNotFoundException ex) {
        //responseEntity = new ResponseEntity(ex.getMessage(),HttpStatus.CONFLICT);
        //}
        return responseEntity;
    }

    @GetMapping("vehicle/vehicleNumber")
    public ResponseEntity<?> getVehicleByVehicleNumber(@PathVariable(value = "vehicleNumber") String vehicleNumber) throws VehicleNotFoundException {
        ResponseEntity responseEntity;
        // try{
        vehicleService.getVehicleByVehicleNumber(vehicleNumber);
        responseEntity = new ResponseEntity<List<Vehicle>>(vehicleService.getVehicleByVehicleNumber(vehicleNumber), HttpStatus.OK);
        // }catch (TrackNotFoundException ex) {
        //   responseEntity = new ResponseEntity(ex.getMessage(),HttpStatus.CONFLICT);
        //}
        return responseEntity;
    }


    // @PutMapping("vehicle/{id}")
    // public  ResponseEntity<?> updateVehicles(@PathVariable(value = "id") int id,@Valid @RequestBody Vehicle vehicle) throws VehicleNotFoundException, VehicleAlreadyExistsException {
    //   ResponseEntity responseEntity;
    // Optional<Vehicle> vehicle1 = vehicleService.getVehicleById(id);
    // try{
    //if(!vehicle1.isPresent()){
    //  throw new Exception("id-"+id);
    // }
    //   vehicle.setVehicleId(id);
    // vehicleService.saveVehicle(vehicle);
    // responseEntity = new ResponseEntity(vehicleService.getVehicles(), HttpStatus.CREATED);
    //}catch (Exception ex) {
    // responseEntity = new ResponseEntity(ex.getMessage(),HttpStatus.CONFLICT);
    //  }
    //  return responseEntity;
    // }

    @DeleteMapping("vehicle/{id}")
    @CrossOrigin
    public ResponseEntity<?> deleteVehicles(@PathVariable("id") int id) {

        ResponseEntity responseEntity;
        //try{
        vehicleService.deleteVehicle(id);
        responseEntity = new ResponseEntity(vehicleService.getVehicles(), HttpStatus.CREATED);
        //}catch (Exception ex) {
        //  responseEntity = new ResponseEntity(ex.getMessage(),HttpStatus.CONFLICT);
        //}
        return responseEntity;
    }


    List<Vehicle> vehiclesForDriverDashboard;

    @GetMapping("/BookVehicle")
    @CrossOrigin
    public ResponseEntity<?> bookVehicleHandler(@RequestParam("slot") String slot, @RequestParam("date") String date, @RequestParam("type") String vehicleType ){

        List<Vehicle> vehicleList = vehicleService.getVehicleForRetailerRequest(slot,date,vehicleType);

        System.out.printf("one");

        this.vehiclesForDriverDashboard = vehicleList;

        ResponseEntity responseEntity;
        responseEntity = new ResponseEntity(vehicleList, HttpStatus.OK);

        return responseEntity;
    }




}

