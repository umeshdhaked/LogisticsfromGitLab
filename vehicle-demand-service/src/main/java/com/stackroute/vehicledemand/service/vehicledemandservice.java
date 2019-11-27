package com.stackroute.vehicledemand.service;

import com.stackroute.vehicledemand.domain.retailerdemand;

public interface vehicledemandservice {
    public retailerdemand savenewvehicledemand(retailerdemand retailerdemand);
    public retailerdemand getvehicledemand();
}
