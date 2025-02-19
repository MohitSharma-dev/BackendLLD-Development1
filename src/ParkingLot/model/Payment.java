package ParkingLot.model;

public class Payment extends BaseModel{
    private int amount;
    private String refNumber;
    private PaymentMode paymentMode;
    private Bill bill;
    private PaymentStatus paymentStatus;
}


// 500
// Payment1 : Cash , 200
// Payment2 : CC : 300

