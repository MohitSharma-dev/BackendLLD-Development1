package InventoryManagementSystem;

import java.util.HashSet;
import java.util.Set;

public class WishList {
    private Set<Item> items;

    public WishList() {
        items = new HashSet<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public Set<Item> getWishListItems() {
        return new HashSet<>(items);
    }

    public int getSize(){
        return items.size();
    }
}
