package InventoryManagementSystem2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
//    it should be fast to access items using id
    private HashMap<String , T> items;

    Inventory(){
        items = new HashMap<>();
    }

    public void add(T item){
        items.put(item.getId(), item);
    }

    public void remove(T item){
        items.remove(item.getId());
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public List<T> getAllItems(){
       return new ArrayList<>(items.values());
    }
}
