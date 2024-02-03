package com.lldprac.parkinglot.dtos;

import com.lldprac.parkinglot.models.Gate;
import com.lldprac.parkinglot.models.ParkingLot;
import com.lldprac.parkinglot.models.Vehicle;
import com.lldprac.parkinglot.models.VehicleType;

public class CreateTicketRequestDto {
    private ParkingLot parkingLot;
    private Gate gate;
    private Vehicle vehicle;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Long gateId;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
}
