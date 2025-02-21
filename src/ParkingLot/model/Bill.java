package ParkingLot.model;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private int totalAmount;
    private Date exitTime;
    private Ticket ticket;
//    partial payments : Cash + UPI
//    cancelled payments
    private List<Payment> payments;
    private Gate exitGate;
    private Operator operator;



}
