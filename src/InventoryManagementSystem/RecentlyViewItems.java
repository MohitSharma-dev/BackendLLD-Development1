package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewItems {
    private LinkedList<Item> items;
    private Integer MAX_SIZE = 3;

    public RecentlyViewItems() {
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        // remove the item if it is already present so that it can be moved at the front
        items.remove(item);

        items.addFirst(item);
        if(items.size() > MAX_SIZE) {
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items);
    }
}
