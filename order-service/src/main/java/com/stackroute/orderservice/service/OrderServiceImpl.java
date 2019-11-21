package com.stackroute.orderservice.service;

import com.stackroute.orderservice.domain.Order;
import com.stackroute.orderservice.domain.TimeSlot;
import com.stackroute.orderservice.repository.OrderRepository;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    //Properties dependent on Message Bus
    private String slotsResponse =
            "{\"TimeSlots\":[{\"Date\": \"2019-12-21\", \"Slot1\": \"40\", \"Slot2\": \"30\", \"Slot3\":\"10\"}, " +
                    "{\"Date\": \"2019-12-20\", \"Slot1\": \"41\", \"Slot2\": \"90\", \"Slot3\":\"20\"}]}"; //Message fetched from Driver company
    private String activeOrder; //Message of new order sent to Driver company


    @Override
    public Order searchOrder(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order saveOrder(Order order) {
//        System.out.println(order.toString());

        Order order1 = orderRepository.saveOrders(order);
        activeOrder = order1.toString();
        return order1;
    }

    @Override
    public TimeSlot checkSlotAvailability(String deliveryDate) throws ParseException {
        //Use dummy message and parse it
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject)jsonParser.parse(slotsResponse);

        JSONArray dates = (JSONArray) jsonObject.get("TimeSlots");

        JSONObject jsonSlot = null;

        for(int i = 0; i < dates.size(); i++){
            JSONObject current = (JSONObject)dates.get(i);
            if(current.get("Date").equals(deliveryDate)){
                System.out.println(current);
                jsonSlot = current;
                break;
            }
        }
        //Check which slots have enough volume and add
        if(jsonSlot != null) {
            TimeSlot timeSlot = new TimeSlot();
            timeSlot.setDate(deliveryDate);
//            if (Double.parseDouble(jsonSlot.get("Slot1").toString()) >= orderVolume){
//                timeSlot.setSlot1(true);
//            }
//            if (Double.parseDouble(jsonSlot.get("Slot2").toString()) >= orderVolume){
//                timeSlot.setSlot2(true);
//            }
//            if (Double.parseDouble(jsonSlot.get("Slot3").toString()) >= orderVolume){
//                timeSlot.setSlot3(true);
//            }
            timeSlot.setSlot1(Double.parseDouble(jsonSlot.get("Slot1").toString()));
            timeSlot.setSlot2(Double.parseDouble(jsonSlot.get("Slot2").toString()));
            timeSlot.setSlot3(Double.parseDouble(jsonSlot.get("Slot3").toString()));
            return timeSlot;
        }
        return null;

    }

    @Override
    public List<Order> findOrdersByDateAndTimeSlot(String date, String timeslot) {
        return orderRepository.findByDeliveryDateAndSlotNumber(date, timeslot);
    }
}
