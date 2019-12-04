package com.stackroute.vehicledemand.service;

import com.stackroute.vehicledemand.domain.newRetailerDemand;
import com.stackroute.vehicledemand.domain.retailerdemand;
import com.stackroute.vehicledemand.repository.newRetailerDemandRepository;
import com.stackroute.vehicledemand.repository.vehicledemandrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class vehicledemandserviceImpl implements vehicledemandservice {
    @Autowired
    vehicledemandrepository vehicledemandrepository;

    @Autowired
    newRetailerDemandRepository newRetailerDemandRepository;

    @Override
    public retailerdemand savenewvehicledemand(retailerdemand retailerdemand) {
        vehicledemandrepository.save(retailerdemand);
        return retailerdemand;
    }

    @Override
    public List<retailerdemand> getvehicledemand() {
        return vehicledemandrepository.findAll();
    }

    @Override
    public newRetailerDemand savenewvehicledemandbyretailer(newRetailerDemand newRetailerDemand) {
        newRetailerDemandRepository.save(newRetailerDemand);

        return newRetailerDemand;
    }

    @Override
    public List<newRetailerDemand> getallvehicledemanded() {
        return newRetailerDemandRepository.findAll();
    }

    @Override
    public boolean deletebyId(BigInteger Id) {
        newRetailerDemandRepository.deleteById(Id);
        return true;
    }
}
