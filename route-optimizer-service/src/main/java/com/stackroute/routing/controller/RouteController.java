package com.stackroute.routing.controller;


import com.stackroute.routing.domain.Depot;
import com.stackroute.routing.domain.Order;
import com.stackroute.routing.domain.Vehicle;
import com.stackroute.routing.service.DepotService;
import com.stackroute.routing.service.OrderService;
import com.stackroute.routing.service.RouteService;
import com.stackroute.routing.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;

@RestController
@RequestMapping(value="api/v1")
public class RouteController {
    OrderService orderService;
    VehicleService vehicleService;
    RouteService routeService;
    DepotService depotService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Autowired
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @Autowired
    public void setRouteService(RouteService routeService) {
        this.routeService = routeService;
    }

    @Autowired
    public void setDepotService(DepotService depotService) {
        this.depotService = depotService;
    }

    @PostMapping("order")
    public ResponseEntity<?> saveOrder(@RequestBody Order order) throws Exception
    {
        orderService.addOrder(order);
        return new ResponseEntity<String>("order added", HttpStatus.OK);
    }

    @PostMapping("vehicle")
    public ResponseEntity<?> saveVehicle(@RequestBody Vehicle vehicle) throws Exception
    {
        vehicleService.saveVehicle(vehicle);
        return new ResponseEntity<String>("vehicle added", HttpStatus.OK);
    }
    @PostMapping("depot")
    public ResponseEntity<?> saveDepot(@RequestBody Depot depot) throws Exception
    {
        depotService.addDepot(depot);
        return new ResponseEntity<String>("depot added", HttpStatus.OK);
    }


    @DeleteMapping("order/{id}")
    public ResponseEntity<?>deleteOrder(@PathVariable int id) throws Exception
    {
        orderService.deleteOrder(id);
        return new ResponseEntity<String>("order deleted", HttpStatus.OK);
    }


    @DeleteMapping("vehicle/{no}")
    public ResponseEntity<?>deleteVehicle(@PathVariable String no) throws Exception
    {
        vehicleService.deleteVehicle(no);
        return new ResponseEntity<String>("vehicle deleted", HttpStatus.OK);
    }
    @DeleteMapping("depot/{id}")
    public ResponseEntity<?>deleteDepot(@PathVariable int id) throws Exception
    {
        depotService.deleteDepot(id);
        return new ResponseEntity<String>("depot deleted", HttpStatus.OK);
    }


    @GetMapping("routes/{wholesalerId}")
    public String getAllRoutes(@PathVariable int wholesalerId) throws  Exception
    {
        return routeService.getRoutes(wholesalerId).toString();
    }
}
