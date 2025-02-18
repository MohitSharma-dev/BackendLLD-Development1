package ParkingLOT.strategies;

import ParkingLOT.model.*;
import java.util.Date;

public interface SlotAssignmentStrategy {
    ParkingSlot assignSlot(ParkingLot lot, Gate gate, Vehicle vehicle, User user, Date entryTime);
}
