package com.stackroute.vehicledemand.service;

import com.stackroute.vehicledemand.domain.retailerdemand;
import com.stackroute.vehicledemand.repository.vehicledemandrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vehicledemandserviceImpl implements vehicledemandservice {
    @Autowired
    vehicledemandrepository vehicledemandrepository;

    @Override
    public retailerdemand savenewvehicledemand(retailerdemand retailerdemand) {
        vehicledemandrepository.save(retailerdemand);
        return retailerdemand;
    }

    @Override
    public List<retailerdemand> getvehicledemand() {
        return vehicledemandrepository.findAll();
    }
}
