package com.stackroute.BackEnd.controller;

import com.google.gson.Gson;
import com.stackroute.BackEnd.domain.Vehicle;
import com.stackroute.BackEnd.exception.VehicleAlreadyExistsException;
import com.stackroute.BackEnd.exception.VehicleNotFoundException;
import com.stackroute.BackEnd.service.VehicleService;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

@RestController
//@CrossOrigin("*")
@RequestMapping(value = "/api/v1")
public class VehicleController<VehicleDao> {
    //Actual Kafka
    @Value("${kafka.bootstrap.servers}")
    private String kafkaBootstrapServers;
    private Properties producerProperties;
    private KafkaProducer<String, String> producer;
    @Value("${kafka.topic.book_driver}")
    private String bookDriverTopic;

    //method to send messages
    private static void sendKafkaMessage(String payload,
                                         KafkaProducer<String, String> producer,
                                         String topic) {
        System.out.println("Sending Kafka message: " + payload);
        producer.send(new ProducerRecord<>(topic, payload));
    }

    private void assignProducerProperties() {
        /*
         * Defining producer properties.
         */
        producerProperties = new Properties();
        producerProperties.put("bootstrap.servers", kafkaBootstrapServers);
        producerProperties.put("acks", "all");
        producerProperties.put("retries", 0);
        producerProperties.put("batch.size", 16384);
        producerProperties.put("linger.ms", 1);
        producerProperties.put("buffer.memory", 33554432);
        producerProperties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producerProperties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        producer = new KafkaProducer<>(producerProperties);
    }
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
        Vehicle[] vehicleArray = new Vehicle[vehiclesForDriverDashboard.size()];
        for (int i =0; i < vehiclesForDriverDashboard.size(); i++) {
            vehicleArray[i] = vehiclesForDriverDashboard.get(i);
        }
//        if(vehicleArray.length > 0){
//            Gson gson = new Gson();
//            sendKafkaMessage(gson.toJson(vehicleArray), producer, bookDriverTopic);
//        }
        ResponseEntity responseEntity;
        responseEntity = new ResponseEntity(vehicleList, HttpStatus.OK);

        return responseEntity;
    }




}

