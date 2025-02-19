package ParkingLOT.model;

public class Vehicle {
    private String licensePlate;
    private VehicleType  vehicleType;
    private User user;//cyclic

    public Vehicle(String licensePlate, VehicleType vehicleType, User user) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.user = user;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
