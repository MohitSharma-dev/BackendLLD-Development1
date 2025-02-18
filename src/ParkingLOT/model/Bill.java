package ParkingLOT.model;

import java.util.List;

public class Bill {
    int billId;
    Ticket ticket;
    double amount;
    List<Payment> payments;
    PaymentStatus paymentStatus;
}
