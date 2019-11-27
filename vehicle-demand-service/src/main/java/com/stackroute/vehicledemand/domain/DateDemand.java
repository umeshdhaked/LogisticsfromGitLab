package com.stackroute.vehicledemand.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "timeslotbooking")
public class DateDemand {
    private String date;
    private TimeSlot timeslot1;
    private TimeSlot timeslot2;
    private TimeSlot timeslot3;

    public DateDemand(String date, TimeSlot timeslot1, TimeSlot timeslot2, TimeSlot timeslot3) {
        this.date = date;
        this.timeslot1 = timeslot1;
        this.timeslot2 = timeslot2;
        this.timeslot3 = timeslot3;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TimeSlot getTimeslot1() {
        return timeslot1;
    }

    public void setTimeslot1(TimeSlot timeslot1) {
        this.timeslot1 = timeslot1;
    }

    public TimeSlot getTimeslot2() {
        return timeslot2;
    }

    public void setTimeslot2(TimeSlot timeslot2) {
        this.timeslot2 = timeslot2;
    }

    public TimeSlot getTimeslot3() {
        return timeslot3;
    }

    public void setTimeslot3(TimeSlot timeslot3) {
        this.timeslot3 = timeslot3;
    }
}
