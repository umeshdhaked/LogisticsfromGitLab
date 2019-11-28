package com.stackroute.vehicledemand.service;

import com.stackroute.vehicledemand.domain.retailerdemand;

import java.util.List;

public interface vehicledemandservice {
    public retailerdemand savenewvehicledemand(retailerdemand retailerdemand);

    public List<retailerdemand> getvehicledemand();
}
