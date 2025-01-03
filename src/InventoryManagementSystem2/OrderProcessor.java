package InventoryManagementSystem2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderProcessor {
    private PriorityQueue<Order> pq;

    public OrderProcessor() {
        pq = new PriorityQueue<>();
    }

    public void setComparator(Comparator<Order> c) {
        pq = new PriorityQueue<>(c);
    }

    public void addOrder(Order order) {
        pq.offer(order);
    }

    public Order processOrder(){
          return pq.poll();
    }

    public int size(){
        return pq.size();
    }
}
