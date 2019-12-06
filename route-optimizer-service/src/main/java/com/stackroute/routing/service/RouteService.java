package com.stackroute.routing.service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public interface RouteService {

    public String getRoutes(JSONArray vehicleJson,String depotAddress,int wholersalerId) throws  Exception;
    public JSONObject coordinateFinder(String[] addresses) throws Exception;
    public double[][] jsonParser(JSONObject requestBody) throws Exception;
    public  String routeOptimizer(double[][] distance, int wholesalerId, JSONArray coordinates,JSONArray vehicleJson,String[] addresses) throws Exception;

}
