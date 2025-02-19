package ParkingLot.model;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private Status parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private int totalCapacity;
    private List<VehicleType> supportedVehicleTypes;
}
