package ParkingLOT.model;

import java.util.List;

public class Bill {
    private int billId;
    private Ticket ticket;
    private double amount;
    private List<Payment> payments;
    private PaymentStatus OverallPaymentStatus;

    public Bill(Ticket ticket, List<Payment> payments) {
        this.ticket = ticket;
        this.payments = payments;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public PaymentStatus getOverallPaymentStatus() {
        return OverallPaymentStatus;
    }

    public void setOverallPaymentStatus(PaymentStatus overallPaymentStatus) {
        OverallPaymentStatus = overallPaymentStatus;
    }
}
