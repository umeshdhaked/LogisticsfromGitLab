package com.stackroute.routing.service;

import com.stackroute.routing.domain.Route;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public interface RouteService {

    public Route saveRoute(Route route);
    public String getRoutesByVehicle(String vehicleNumber,String slot);
    public String getRoutes(JSONArray vehicleJson,String depotAddress,int wholersalerId) throws  Exception;
    public JSONObject coordinateFinder(String[] addresses) throws Exception;
    public double[][] jsonParser(JSONObject requestBody) throws Exception;
    public  String routeOptimizer(double[][] distance, int wholesalerId, JSONArray coordinates,JSONArray vehicleJson,String[] addresses) throws Exception;

}
