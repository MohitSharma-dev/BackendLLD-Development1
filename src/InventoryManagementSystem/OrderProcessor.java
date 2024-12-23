package InventoryManagementSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
//    we need to process the order according to some priority
    private Queue<Order> orders;

    public OrderProcessor() {
//        orders = new LinkedList<>();
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.offer(order);
//        supports add , offer
    }

    public Order processOrder() {
        return orders.poll();
    }

    public int getSize(){
        return orders.size();
    }

}
