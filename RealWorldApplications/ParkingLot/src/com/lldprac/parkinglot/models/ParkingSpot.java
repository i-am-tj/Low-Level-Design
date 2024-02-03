package com.lldprac.parkinglot.models;

import java.util.List;

public class ParkingSpot extends BaseModel {
    private int number;
    private List<VehicleType> supportedVehicles;
    private SpotStatus spotStatus;
}
