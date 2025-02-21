package ParkingLot.repository;

import ParkingLot.model.Gate;
import ParkingLot.model.GateType;
import ParkingLot.model.Operator;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer , Gate> gates;

    public GateRepository(){
        gates = new TreeMap<>();
        gates.put(1 , new Gate(1 , "1" , GateType.ENTRY , new Operator(1 , "XYZ")));
        gates.put(2 , new Gate(2 , "2" , GateType.ENTRY , new Operator(2 , "ABC")));
        gates.put(3 , new Gate(3 , "3" , GateType.ENTRY , new Operator(3 , "XYZABC")));
    }

    public Optional<Gate> findById(int gateId){
        return Optional.of(gates.get(gateId));
    }
}

// Gate can be null also, so better wrap it in Optional