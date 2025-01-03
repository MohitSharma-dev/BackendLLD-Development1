package InventoryManagementSystem2;

import java.util.Comparator;

public class OrderTotalAmountComparator implements Comparator<Order> {
//    the order which has higher total amount, we want to process that first

    @Override
    public int compare(Order o1, Order o2) {
//        o1 to come first => return negative
//        o2 to come first => return positive
        if(o1.getTotalAmount() > o2.getTotalAmount()){
            return -1;
        }
        return 1;
    }
}
