package ParkingLot.strategies;

import ParkingLot.model.ParkingLot;
import ParkingLot.model.ParkingSlot;
import ParkingLot.model.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}


