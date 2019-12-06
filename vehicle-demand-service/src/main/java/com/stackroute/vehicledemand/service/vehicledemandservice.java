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
    public List<newRetailerDemand> searchbyretailerId(int id);
    public List<rejectedRetailerRequest> findByRetailerIdinrejectedlist(int retailerId);
<<<<<<< HEAD
    public List<acceptedRetailerRequest> addordertoSlotvehicle(int retailerId,String slot,int volumeBooked);
=======
    public List<acceptedRetailerRequest> findByRetailerIdinacceptedlist(int retailerId);
>>>>>>> 668337944932b95726739813fb93331f7945b754

}
