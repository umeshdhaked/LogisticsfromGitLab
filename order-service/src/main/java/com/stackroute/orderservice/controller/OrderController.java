package com.stackroute.orderservice.controller;

import com.stackroute.orderservice.domain.Order;
import com.stackroute.orderservice.domain.TimeSlot;
import com.stackroute.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    ResponseEntity responseEntity;
    @GetMapping("/slots")
    public ResponseEntity<?> getAvailableSlots(@RequestParam("date") String date, @RequestParam("volume") Double volume){
        try {
            responseEntity = new ResponseEntity<TimeSlot>(orderService.checkSlotAvailability(date, volume), HttpStatus.OK);
        }catch (Exception e){
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveTrack(@RequestBody Order order){
        try{
            orderService.saveOrder(order);
            responseEntity = new ResponseEntity("Successfully created", HttpStatus.CREATED);
        }catch (Exception e){
            responseEntity = new ResponseEntity(e.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
}
