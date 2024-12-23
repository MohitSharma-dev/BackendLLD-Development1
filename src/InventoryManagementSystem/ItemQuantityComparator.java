package InventoryManagementSystem;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {

//    desc order of quantity
//    the item which will have larger quantity will come first
    @Override
    public int compare(Item o1, Item o2) {
//        o1 to win return -1
//        o2 to win return 1

        if(o1.getQuantity() < o2.getQuantity()){
            return 1;
        } else if(o1.getQuantity() > o2.getQuantity()){
            return -1;
        }
        return 0;
    }
}

// Integer.compare();