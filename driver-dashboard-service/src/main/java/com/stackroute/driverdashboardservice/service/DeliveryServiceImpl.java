package com.stackroute.driverdashboardservice.service;

import com.stackroute.driverdashboardservice.domain.DeliveryRoute;
import com.stackroute.driverdashboardservice.domain.DeliveryStop;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryServiceImpl implements DeliveryService {
    //this variable has to be sent to route optimization service
    private boolean orderAccepted;

    @Override
    public DeliveryRoute getNextDeliveryRoute(String date, String vehicleId, String timeslot) throws ParseException {
        //Call route optimization service with vehicleId,today's date, and current time slot
        //Hard coding values for now

        String jsonData = "{\"vehicleId\": \"ABC123\"," +
                "\"orderVolume\": \"45.2\"," +
                "\"routes\":[{" +
                "\"stopNumber\":\"1\"," +
                "\"longitude\":\"32.21\"," +
                "\"latitude\":\"23.45\"" +
                "\"orderId\":\"24\"},{" +
                "\"stopNumber\":\"2\"," +
                "\"longitude\":\"32.74\"," +
                "\"latitude\":\"24.45\"" +
                "\"orderId\":\"31\"}" +
                "]}";

        DeliveryRoute deliveryRoute = new DeliveryRoute();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);

        deliveryRoute.setVehicleId((String) jsonObject.get("vehicleId"));
        deliveryRoute.setOrderVolume(Double.parseDouble((String) jsonObject.get("orderVolume")));

        JSONArray routes = (JSONArray) jsonObject.get("routes");
        List<DeliveryStop> stops = new ArrayList<>();

        for (int i = 0; i < routes.size(); i++) {
            JSONObject currentStop = (JSONObject) routes.get(i);
            stops.add(new DeliveryStop(
                    Integer.parseInt((String) currentStop.get("stopNumber")),
                    Double.parseDouble((String) currentStop.get("longitude")),
                    Double.parseDouble((String) currentStop.get("latitude")),
                    Integer.parseInt((String) currentStop.get("orderId"))));
        }
        deliveryRoute.setDeliveryStops(stops);
        return deliveryRoute;
    }

    @Override
    public void cancelDelivery(String vehicleId) {
        //send a request to routing service
        //for now just modify truth value of a variable
        this.orderAccepted = false;
    }

    @Override
    public void acceptDelivery(String vehicleId) {
        //same as cancel delivery
        //should also reroute to order pickup page
        this.orderAccepted = true;
    }
}
