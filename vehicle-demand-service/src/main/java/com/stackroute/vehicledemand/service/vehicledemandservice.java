package com.stackroute.vehicledemand.service;

import com.stackroute.vehicledemand.domain.acceptedRetailerRequest;
import com.stackroute.vehicledemand.domain.newRetailerDemand;
import com.stackroute.vehicledemand.domain.rejectedRetailerRequest;
import com.stackroute.vehicledemand.domain.retailerdemand;

import java.math.BigInteger;
import java.util.List;

public interface vehicledemandservice {
    public retailerdemand savenewvehicledemand(retailerdemand retailerdemand);

    public List<newRetailerDemand> getvehicledemand();
    public newRetailerDemand savenewvehicledemandbyretailer(newRetailerDemand newRetailerDemand);
    public List<newRetailerDemand> getallvehicledemanded();
    public boolean deletebyId(BigInteger Id);
    public acceptedRetailerRequest savenewaccepetedVehicleDemand( acceptedRetailerRequest acceptedRetailerRequest);
    public rejectedRetailerRequest savenewrejectedVehicleDemand(rejectedRetailerRequest rejectedRetailerRequest);

}
