package com.stackroute.vehicledemand.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.stackroute.vehicledemand.domain.DateDemand;
import com.stackroute.vehicledemand.domain.retailerdemand;
import com.stackroute.vehicledemand.repository.vehicledemandrepository;
import com.stackroute.vehicledemand.service.vehicledemandservice;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class retailervehicledemandcontroller {
    @Autowired
    public vehicledemandservice vehicledemandservice;
//    @Autowired
//    public retailervehicledemandcontroller(vehicledemandservice vehicledemandservice){
//        this.vehicledemandservice=vehicledemandservice;
//    }


    @PostMapping(value = "/save", consumes = "application/json")
    public ResponseEntity savenewretailerdemand(@RequestBody retailerdemand retailerdemand) {
//        retailerdemand x = new retailerdemand();
//        x = retailerdemand;
//        System.out.println(x.getTimeSlot());
//        System.out.println(x.getDate());
//        System.out.println(x.getVolume());

        ResponseEntity responseEntity;
        try {
            vehicledemandservice.savenewvehicledemand(retailerdemand);

            responseEntity = new ResponseEntity<>("Successfully created", HttpStatus.CREATED);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<>("get some sense", HttpStatus.CONFLICT);
            e.printStackTrace();
        }
        return responseEntity;
    }
    public JsonArray toJson(DateDemand[] dateDemands){
        JsonArray array = new JsonArray();
        for(DateDemand demand: dateDemands){
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("date", demand.getDate());
            jsonObject.addProperty("Timeslot1slot", demand.getTimeslot1().getSlot());
            jsonObject.addProperty("Timeslot1volume", demand.getTimeslot1().getVolume());
            jsonObject.addProperty("Timeslot2slot", demand.getTimeslot2().getSlot());
            jsonObject.addProperty("Timeslot2volume", demand.getTimeslot2().getSlot());
            jsonObject.addProperty("Timeslot3slot", demand.getTimeslot3().getSlot());
            jsonObject.addProperty("Timeslot3volume", demand.getTimeslot3().getSlot());
            array.add(jsonObject);
        }
        return array;
    }

}
