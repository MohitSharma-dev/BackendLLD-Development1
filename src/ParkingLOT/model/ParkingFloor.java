package ParkingLOT.model;

public class ParkingFloor {
    private int parkingFloorId;
    private Status parkingFloorStatus;
    //int  parkingLotId;
    private ParkingLot parkingLot;

    public ParkingFloor(int parkingFloorId, Status parkingFloorStatus, ParkingLot parkingLot) {
        this.parkingFloorId = parkingFloorId;
        this.parkingFloorStatus = Status.VACANT;
        this.parkingLot = parkingLot;
    }

    public int getParkingFloorId() {
        return parkingFloorId;
    }

    public void setParkingFloorId(int parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
    }

    public Status getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(Status parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
}
