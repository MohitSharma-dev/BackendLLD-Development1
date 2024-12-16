package Concurrency4.ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
    private int maxSize;
    private ConcurrentLinkedQueue<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
//        arrayList is not made for concurrenct accesses : Not a thread safe data structures
//        we should use a DS which is concurrent
        items = new ConcurrentLinkedQueue<>();
    }

    public void addItem(Object item){
        items.add(item);
        System.out.println("Producer is producing the items : " + items.size());
    }

    public void removeItem(){
        items.remove();
        System.out.println("Consumer has consumed the item : " + items.size());
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ConcurrentLinkedQueue<Object> getItems() {
        return items;
    }

    public void setItems(ConcurrentLinkedQueue<Object> items) {
        this.items = items;
    }
}
