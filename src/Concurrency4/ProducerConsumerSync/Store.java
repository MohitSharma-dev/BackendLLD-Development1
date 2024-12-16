package Concurrency4.ProducerConsumerSync;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<>(maxSize);
    }

    public void addItem(Object item){
        items.add(item);
        System.out.println("Producer is producing the items : " + items.size());
    }

    public void removeItem(){
        items.remove(items.size()-1);
        System.out.println("Consumer has consumed the item : " + items.size());
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }
}
