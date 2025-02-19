package ParkingLOT.model;

import java.util.List;

public class ParkingLot {
    private int parkingLotId;
    private Status parkingLotStatus;
    private int numberOfFloors;
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.parkingLotStatus = Status.VACANT;
        this.floors = floors;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Status getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }
}
