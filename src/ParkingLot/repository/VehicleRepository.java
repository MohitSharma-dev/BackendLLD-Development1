package ParkingLot.repository;

import ParkingLot.model.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles;
    private static int counter = 0;

    public VehicleRepository() {
        vehicles = new HashMap<>();
    }

    public Optional<Vehicle> findByLicensePlate(String licensePlate){
        return Optional.ofNullable(vehicles.get(licensePlate));
    }

    public Vehicle save(Vehicle vehicle){
        counter++;
        vehicle.setId(counter);
        vehicles.put(vehicle.getLicensePlate(), vehicle);
        return vehicle;
//        allocate a id to vehicle
    }
}
