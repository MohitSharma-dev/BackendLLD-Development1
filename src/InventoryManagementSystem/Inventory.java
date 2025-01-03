package InventoryManagementSystem;

import java.util.*;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void add(T item) throws InvalidQuantityException {
        if(item.getQuantity() < 0){
            throw new InvalidQuantityException("Quantity is less than equal to zero which is invalid");
        }
        if(items.containsKey(item.getId())) {
//            System.out.println("Item " + item.getId() + " already exists");
            throw new DuplicateItemException("Item " + item.getId() + " already exists");
        }
        items.put(item.getId(), item);
    }

    public void remove(T item) {
        items.remove(item.getId());
    }

    public T get(String id) {
        return items.get(id);
    }

    public List<T> getAll() {
        return new ArrayList<>(items.values());
    }

    public List<T> filterByPrice(double minPrice , double maxPrice) {
        List<T> filtered = new ArrayList<>();
        for(T item : items.values()) {
            if(item.getPrice() >= minPrice && item.getPrice() <= maxPrice) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public List<T> filterByAvailability() {
        List<T> filtered = new ArrayList<>();
        for(T item : items.values()) {
            if (item.getQuantity() > 0){
                filtered.add(item);
            }
        }
        return filtered;
    }

    public List<T> sortItems(Comparator<T> comparator){
        List<T> sortedItems = new ArrayList<>(items.values());
        Collections.sort(sortedItems , comparator);
        return sortedItems;
    }
}
