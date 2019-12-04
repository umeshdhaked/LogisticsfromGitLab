package com.stackroute.vehicledemand.service;

import com.stackroute.vehicledemand.domain.newRetailerDemand;
import com.stackroute.vehicledemand.domain.retailerdemand;

import java.math.BigInteger;
import java.util.List;

public interface vehicledemandservice {
    public retailerdemand savenewvehicledemand(retailerdemand retailerdemand);

    public List<retailerdemand> getvehicledemand();
    public newRetailerDemand savenewvehicledemandbyretailer(newRetailerDemand newRetailerDemand);
    public List<newRetailerDemand> getallvehicledemanded();
    public boolean deletebyId(BigInteger Id);
}
