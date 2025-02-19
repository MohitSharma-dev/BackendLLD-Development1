package ParkingLOT.model;

public class ParkingSlot {
    private int parkingslotId;
    private Vehicle vehicle;
    private ParkingSlotType parkingSlotType;
    private Status parkingSlotStatus;
    //int parkingFloorId;
    private ParkingFloor parkingFloor;

    public ParkingSlot(ParkingSlotType parkingSlotType, ParkingFloor parkingFloor) {
        this.parkingSlotType = parkingSlotType;
        this.parkingSlotStatus = Status.VACANT;
        this.parkingFloor = parkingFloor;
    }

    public int getParkingslotId() {
        return parkingslotId;
    }

    public void setParkingslotId(int parkingslotId) {
        this.parkingslotId = parkingslotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlotType getParkingSlotType() {
        return parkingSlotType;
    }

    public void setParkingSlotType(ParkingSlotType parkingSlotType) {
        this.parkingSlotType = parkingSlotType;
    }

    public Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
