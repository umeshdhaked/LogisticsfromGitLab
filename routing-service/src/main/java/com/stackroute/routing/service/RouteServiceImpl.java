package com.stackroute.routing.service;

import com.stackroute.routing.domain.Order;
import com.stackroute.routing.domain.Vehicle;
import com.stackroute.routing.repository.OrderRepository;
import com.stackroute.routing.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.json.JSONObject;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import com.google.ortools.constraintsolver.Assignment;
import com.google.ortools.constraintsolver.FirstSolutionStrategy;
import com.google.ortools.constraintsolver.RoutingIndexManager;
import com.google.ortools.constraintsolver.RoutingModel;
import com.google.ortools.constraintsolver.RoutingSearchParameters;
import com.google.ortools.constraintsolver.main;
import org.springframework.stereotype.Service;


@Service
public class RouteServiceImpl implements RouteService {

    static {
        System.loadLibrary("jniortools");
    }


    OrderRepository orderRepository;
    VehicleRepository vehicleRepository;

    private static final Logger
            logger = Logger.getLogger(RouteServiceImpl.class.getName());;
    @Autowired
    public RouteServiceImpl(OrderRepository orderRepository, VehicleRepository vehicleRepository) {
        this.orderRepository = orderRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public JSONObject getRoutes() throws Exception {

        List<Order> orders = orderRepository.findAll();

        String[] adressess = new String[orders.size()];
        Iterator<Order> it =orders.iterator();
        int i=0;
        while (it.hasNext())
        {
            adressess[i]=it.next().getCustomerAddress();
            i++;
        }
        for(int j=0;j<adressess.length;j++)
        {
            System.out.println(adressess[j]);
        }
        JSONObject coordinates = coordinateFinder(adressess);
        float distance[][] = jsonParser(coordinates);
        return routeOptimizer(distance);

    }

    @Override
    public JSONObject coordinateFinder(String[] addresses) throws Exception {
        String key = "Am645nTS2rVqgDNr8UDKqZPdOL-X2_Z94sS5-GqjNBcoMfSOi_dVC6KTDGxL_jDb";

        JSONArray allLocations=new JSONArray();
        JSONObject obj_JSONObject;
        for(int i=0;i<addresses.length;i++)
        {


            JSONObject locationCoordinates=new JSONObject();
            String url = "http://dev.virtualearth.net/REST/v1/Locations?query="+addresses[i]+"&includeNeighborhood=1&include=1&maxResults=5&key="+key;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;

            StringBuffer response = new StringBuffer();
            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();


                System.out.println(response.toString());
            obj_JSONObject = new JSONObject(response.toString());
            JSONObject point=obj_JSONObject.getJSONArray("resourceSets")
                    .getJSONObject(0)
                    .getJSONArray("resources")
                    .getJSONObject(0)
                    .getJSONObject("point");


            float latitude=point.getJSONArray("coordinates").getFloat(0);
            float longitude=point.getJSONArray("coordinates").getFloat(1);
//                System.out.println(latitude+" "+longitude);
            locationCoordinates.put("latitude",latitude);
            locationCoordinates.put("longitude",longitude);
            allLocations.put(i,locationCoordinates);

        }

        //                System.out.println(allLocations.toString());
        JSONObject requestObject=new JSONObject();
        requestObject.put("origins",allLocations);
        requestObject.put("destinations",allLocations);
        requestObject.put("travelMode","driving");
        System.out.println(requestObject.toString());

                return requestObject;
    }

    @Override
    public float[][] jsonParser(JSONObject requestBody) throws Exception {
        String key = "Am645nTS2rVqgDNr8UDKqZPdOL-X2_Z94sS5-GqjNBcoMfSOi_dVC6KTDGxL_jDb";
        String url = "https://dev.virtualearth.net/REST/v1/Routes/DistanceMatrix?key="+key;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("POST");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        con.setDoOutput(true);
        con.setDoInput(true);
//                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                    String inputLine;
//                    StringBuffer response = new StringBuffer();
//                    while ((inputLine = in .readLine()) != null) {
//                        response.append(inputLine);
//                    } in .close();
        OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
        wr.write(requestBody.toString());
        wr.flush();

//display what returns the POST request

        StringBuilder sb = new StringBuilder();
        int HttpResult = con.getResponseCode();
        if (HttpResult == HttpURLConnection.HTTP_OK) {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), "utf-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
            System.out.println("" + sb.toString());
        } else {
            System.out.println(con.getResponseMessage());
        }
        //  System.out.println(response.toString());
        JSONObject obj_JSONObject = new JSONObject(sb.toString());
        JSONArray results=obj_JSONObject.getJSONArray("resourceSets").getJSONObject(0).getJSONArray("resources").getJSONObject(0).getJSONArray("results");
        JSONObject resources=obj_JSONObject.getJSONArray("resourceSets").getJSONObject(0).getJSONArray("resources").getJSONObject(0);
        int noOfDestinations=resources.getJSONArray("destinations").length();
        int noOfOrigins=resources.getJSONArray("origins").length();
        float [][]distancematrix =new float[noOfDestinations][noOfOrigins];
        int total=noOfDestinations*noOfOrigins;
        int i=0,j=0;
        for (i=0;i<total;i++)
        {
            int rowIndex=results.getJSONObject(i).getInt("destinationIndex");
            int colIndex=results.getJSONObject(i).getInt("originIndex");
            distancematrix[rowIndex][colIndex]=results.getJSONObject(i).getFloat("travelDistance");
        }
        for (i = 0; i <noOfDestinations ; i++)
        {
            for (j = 0; j < noOfOrigins; j++)
            {
                System.out.print(distancematrix[i][j]+"\t");
            }
            System.out.println("\n");
        }
        return distancematrix;
    }

    @Override
    public JSONObject routeOptimizer(float[][] distanceMatrix) throws Exception {

        List<Order> orders = orderRepository.findAll();
        Long[] orderVolumes = new Long[orders.size()];
        Iterator<Order> it =orders.iterator();
        Order Orders[] =new Order[orders.size()];
        int i=0;
        while (it.hasNext())
        {
            Orders[i] =it.next();
           orderVolumes[i]= Orders[i].getOrderVolume();
            System.out.println(orderVolumes[i]);
           i++;
        }
        final Long[] demands = orderVolumes;
        List<Vehicle> vehicles=vehicleRepository.findAll();
        long[] capacities = new long[vehicles.size()];
        Vehicle Vehicles[] =new Vehicle[vehicles.size()];
        Iterator<Vehicle> It = vehicles.iterator();
        i=0;
        while (It.hasNext())
        {
            Vehicles[i]=It.next();
            capacities[i]=Vehicles[i].getCapacity();
            System.out.println(capacities[i]);
            i++;
        }
        final long[] vehicleCapacities = capacities;
        // [END demands_capacities]
        final int vehicleNumber = i;
        final int depot = 0;

        RoutingIndexManager manager =
                new RoutingIndexManager(distanceMatrix.length, vehicleNumber,depot);
        // [END index_manager]


        RoutingModel routing = new RoutingModel(manager);


        final int transitCallbackIndex =
                routing.registerTransitCallback((long fromIndex, long toIndex) -> {
                    // Convert from routing variable Index to user NodeIndex.
                    int fromNode = manager.indexToNode(fromIndex);
                    int toNode = manager.indexToNode(toIndex);
                    return (long) distanceMatrix[fromNode][toNode];
                });
        // [START arc_cost]
        routing.setArcCostEvaluatorOfAllVehicles(transitCallbackIndex);
        // [END arc_cost]
        // Add Capacity constraint.
        // [START capacity_constraint]
        final int demandCallbackIndex = routing.registerUnaryTransitCallback((long fromIndex) -> {
            // Convert from routing variable Index to user NodeIndex.
            int fromNode = manager.indexToNode(fromIndex);
            return demands[fromNode];
        });

        routing.addDimensionWithVehicleCapacity(demandCallbackIndex, 0, // null capacity slack
                vehicleCapacities, // vehicle maximum capacities
                true, // start cumul to zero
                "Capacity");

        // Setting first solution heuristic.
        // [START parameters]
        RoutingSearchParameters searchParameters =
                main.defaultRoutingSearchParameters()
                        .toBuilder()
                        .setFirstSolutionStrategy(FirstSolutionStrategy.Value.PATH_CHEAPEST_ARC)
                        .build();
        // [END parameters]
        // Solve the problem.
                // [START solve]
                Assignment solution = routing.solveWithParameters(searchParameters);
        // [END solve]
        JSONObject routes =new JSONObject();

        float totalDistance = 0;
        long totalLoad = 0;
        for (i = 0; i <vehicleNumber; ++i) {
            long index = routing.start(i);
            float routeDistance = 0;
            long routeLoad = 0;
            String route = "";
            JSONArray  values= new JSONArray();
            JSONArray  Values= new JSONArray();
            while (!routing.isEnd(index)) {
                long nodeIndex = manager.indexToNode(index);
                routeLoad += demands[(int) nodeIndex];
                values.put(Orders[(int)nodeIndex]);
                route += nodeIndex + " Load(" + routeLoad + ") -> ";
                long previousIndex = index;
                index = solution.value(routing.nextVar(index));
                routeDistance += routing.getArcCostForVehicle(previousIndex, index, i);
            }
            long lastIndex =manager.indexToNode(index);
            System.out.println((int)lastIndex);
            values.put(Orders[(int)lastIndex]);
            JSONObject obj=new JSONObject();
            obj.put("distance",routeDistance);
            obj.put("orders",values);
            Values.put(obj);
            routes.put(Vehicles[i].getVehicleNumber(),Values);
//            route += manager.indexToNode(routing.end(i));
//            logger.info(route);
//            logger.info("Distance of the route: " + routeDistance + "m");
//            totalDistance += routeDistance;
//            totalLoad += routeLoad;
        }
//        logger.info("Total distance of all routes: " + totalDistance + "m");
//        logger.info("Total load of all routes: " + totalLoad);

        System.out.println(routes.toString());
        return routes;
    }
}

