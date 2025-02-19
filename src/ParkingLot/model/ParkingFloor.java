package ParkingLot.model;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private String number;
    private List<ParkingSlot> parkingSlots;
    private Status parkingFloorStatus;
    private List<VehicleType> supportedVehicleTypes;
}
