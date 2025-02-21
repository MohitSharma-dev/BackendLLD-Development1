package ParkingLot.strategies;

import ParkingLot.model.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategy(SlotAssignmentStrategyType type) {
        if (type == SlotAssignmentStrategyType.RANDOM) {
            return new RandomSlotAllocationStrategy();
        }
        return null;
    }
}
