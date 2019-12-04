package com.stackroute.routing.service;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public interface RouteService {

    public String getRoutes(int wholersalerId) throws  Exception;
    public JSONObject coordinateFinder(String[] addresses) throws Exception;
    public float[][] jsonParser(JSONObject requestBody) throws Exception;
    public  String routeOptimizer(float[][] distance, int wholesalerId, JSONArray coordinates) throws Exception;

}
