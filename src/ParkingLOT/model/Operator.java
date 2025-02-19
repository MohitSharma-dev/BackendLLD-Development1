package ParkingLOT.model;

public class Operator extends User{
    private Gate gate;
    private OperatorType operatorType;

    public Operator(Gate gate, OperatorType operatorType) {
        this.gate = gate;
        this.operatorType = operatorType;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public OperatorType getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(OperatorType operatorType) {
        this.operatorType = operatorType;
    }
}
