package com.stackroute.driverdashboardservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryRoute {
    private String timeSlot;
    private String vehicleId;
    private double orderVolume;
    private List<DeliveryStops> deliveryStops;
}
