package ParkingLOT.model;

public abstract class User {
    private String name;
    private String phone;
    private UserType userType;
    private Vehicle vehicle;//cyclic relationship

    public User(String name, String phone, UserType userType, Vehicle vehicle) {
        this.name = name;
        this.phone = phone;
        this.userType = userType;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
