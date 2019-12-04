package com.stackroute.vehicledemand.domain;


//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "Newretailerdemand")
public class newRetailerDemand {
    @Id
    BigInteger id;
    String vehicleNumber;
    String driverName;
    String vehicleType;
    int capacity;
    int costPerSlot;
    String vehicleStatus;
    String slot1;
    String slot2;
    String slot3;
//    String date;

   String companyName;
   String slot;
   int retailerId;

    public newRetailerDemand() {
    }

    public newRetailerDemand(BigInteger id, String vehicleNumber, String driverName, String vehicleType, int capacity, int costPerSlot, String vehicleStatus, String slot1, String slot2, String slot3, String companyName, String slot, int retailerId) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.costPerSlot = costPerSlot;
        this.vehicleStatus = vehicleStatus;
        this.slot1 = slot1;
        this.slot2 = slot2;
        this.slot3 = slot3;
        this.companyName = companyName;
        this.slot = slot;
        this.retailerId = retailerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(int retailerId) {
        this.retailerId = retailerId;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCostPerSlot() {
        return costPerSlot;
    }

    public void setCostPerSlot(int costPerSlot) {
        this.costPerSlot = costPerSlot;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getSlot1() {
        return slot1;
    }

    public void setSlot1(String slot1) {
        this.slot1 = slot1;
    }

    public String getSlot2() {
        return slot2;
    }

    public void setSlot2(String slot2) {
        this.slot2 = slot2;
    }

    public String getSlot3() {
        return slot3;
    }

    public void setSlot3(String slot3) {
        this.slot3 = slot3;
    }


    @Override
    public String toString() {
        return "newRetailerDemand{" +
                "id=" + id +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", capacity=" + capacity +
                ", costPerSlot=" + costPerSlot +
                ", vehicleStatus='" + vehicleStatus + '\'' +
                ", slot1='" + slot1 + '\'' +
                ", slot2='" + slot2 + '\'' +
                ", slot3='" + slot3 + '\'' +
                ", companyName='" + companyName + '\'' +
                ", slot='" + slot + '\'' +
                ", retailerId=" + retailerId +
                '}';
    }
}
