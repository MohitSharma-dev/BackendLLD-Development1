package ParkingLOT.model;

public class Payment {
    private int paymentId;
    private double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;

    public Payment(double amount, PaymentMode paymentMode) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentStatus=PaymentStatus.PENDING;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
