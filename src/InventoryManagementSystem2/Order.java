package InventoryManagementSystem2;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;
    private int totalAmount;

    public Order(String orderId, boolean isExpress, int totalAmount) {
        this.orderId = orderId;
        this.isExpress = isExpress;
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order other) {
//        this vs Other
        if(this.isExpress == other.isExpress){
            return this.orderId.compareTo(other.orderId);
        } else if(this.isExpress){
            return -1;
        } else {
            return 1;
        }
    }
}

// we need to compare two orders
// order1 order2
// order1 should come first if it is express
// if both are similar kind of order then decide on the basis of orderId
