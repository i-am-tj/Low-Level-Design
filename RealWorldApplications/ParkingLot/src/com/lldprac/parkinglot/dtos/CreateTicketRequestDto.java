package com.lldprac.parkinglot.dtos;

import com.lldprac.parkinglot.models.Gate;
import com.lldprac.parkinglot.models.ParkingLot;
import com.lldprac.parkinglot.models.Vehicle;

public class CreateTicketRequestDto {
    private ParkingLot parkingLot;
    private Gate gate;
    private Vehicle vehicle;
}
