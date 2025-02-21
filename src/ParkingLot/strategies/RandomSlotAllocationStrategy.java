package ParkingLot.strategies;

import ParkingLot.model.*;

public class RandomSlotAllocationStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()) {
                if(parkingSlot.getParkingSlotStatus() == Status.AVAILABLE
                && parkingSlot.getVehicleType() == vehicleType) {
                    parkingSlot.setParkingSlotStatus(Status.FILLED);
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}
