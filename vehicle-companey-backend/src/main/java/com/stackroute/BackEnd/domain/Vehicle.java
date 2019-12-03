package com.stackroute.BackEnd.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

//@Entity
@Document
public class Vehicle {

    @Id
    @GeneratedValue
    int id;
    String vehicleNumber;
    String driverName;
    String vehicleType;
    int capacity;
    int costPerSlot;
    String vehicleStatus;
    String slot1;
    String slot2;
    String slot3;


    String date;
    String slot1Status;
    String slot2Status;

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

    String slot3Status;

    public Vehicle() { }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSlot1Status() {
        return slot1Status;
    }

    public void setSlot1Status(String slot1Status) {
        this.slot1Status = slot1Status;
    }

    public String getSlot2Status() {
        return slot2Status;
    }

    public void setSlot2Status(String slot2Status) {
        this.slot2Status = slot2Status;
    }

    public String getSlot3Status() {
        return slot3Status;
    }

    public void setSlot3Status(String slot3Status) {
        this.slot3Status = slot3Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}

