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
        JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonData);

        deliveryRoute.setVehicleId((String)jsonObject.get("vehicleId"));
        deliveryRoute.setOrderVolume((Double)jsonObject.get("orderVolume"));

        JSONArray routes = (JSONArray) jsonObject.get("routes");
        List<DeliveryStop> stops = new ArrayList<>();

        for(int i = 0; i < routes.size(); i++){
            JSONObject currentStop = (JSONObject) routes.get(i);
            stops.add(new DeliveryStop(
                    (Integer) currentStop.get("stopNumber"),
                    (Double) currentStop.get("longitude"),
                    (Double) currentStop.get("latitude"),
                    (Integer) currentStop.get("orderId")));
        }
        return deliveryRoute;
    }

    @Override
    public void cancelDelivery(String vehicleId, int orderId) {

    }

    @Override
    public void acceptDelivery(String vehicleId) {

    }
}
