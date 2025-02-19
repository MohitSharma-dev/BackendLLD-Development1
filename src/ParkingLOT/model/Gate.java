package ParkingLOT.model;

import java.util.Date;

public class Gate {
    private int gateId;
    private Date time;
    private GateType gateType;

    public Gate(Date time, GateType gateType) {
        this.time = time;
        this.gateType = gateType;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
