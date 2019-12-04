package com.stackroute.routing.service;

import org.json.JSONObject;

import java.util.List;

public interface RouteService {

    public JSONObject getRoutes() throws  Exception;
    public JSONObject coordinateFinder(String[] addresses) throws Exception;
    public float[][] jsonParser(JSONObject requestBody) throws Exception;
    public  JSONObject routeOptimizer(float[][] distance) throws Exception;

}
