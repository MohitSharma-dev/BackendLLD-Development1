package ParkingLot.repository;

import ParkingLot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Integer , ParkingLot> parkingLots;
    public ParkingLotRepository() {
        parkingLots = new TreeMap<>();
    }
    public Optional<ParkingLot> findById(int id){
        return Optional.ofNullable(parkingLots.get(id));
    }
}
