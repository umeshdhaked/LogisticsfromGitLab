package com.stackroute.orderservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateDemand {
    private String date;
    private TimeSlot timeSlot1;
    private TimeSlot timeSlot2;
    private TimeSlot timeSlot3;
}
