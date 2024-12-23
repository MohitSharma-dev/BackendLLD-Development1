package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        Clothing tShirt = new Clothing("C1", "T-Shirt", 19.99, 100, "M");
        Book java = new Book("B1", "Java Programming", 59.99, 0, "John Doe");

        items.add(new Electronics("E1", "Laptop", 999.99, 5, 24));
        items.add(new Clothing("C1", "T-Shirt", 19.99, 100, "M"));
        items.add(new Book("B1", "Java Programming", 59.99, 50, "John Doe"));

        System.out.println(items.get(0).compareTo(items.get(1)));

        System.out.println();

        Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getName());
        }

//        4 1 5 3 2 : 1 2 3 4 5

        Inventory<Electronics> inventory = new Inventory<>();

        Electronics laptop = new Electronics("E1", "Laptop", 999.99, 5, 24);
        Electronics mobilePhone = new Electronics("E2", "Mobile", 500, 10, 12);
        Electronics earphones = new Electronics("E3", "Earphones", 500, 10, 12);

        inventory.add(laptop);
        inventory.add(mobilePhone);
        inventory.add(earphones);

        inventory.remove(mobilePhone);

        Electronics e1 =  inventory.get("E1");
        System.out.println(e1.getName());

        List<Electronics> itemsList = inventory.getAll();
        System.out.println("Printing all items in the inventory");
        for(Electronics item : itemsList) {
            System.out.println(item.getName());
        }

//        Test recently viewed items
        RecentlyViewItems recentlyViewItems = new RecentlyViewItems();

        recentlyViewItems.addRecentlyViewedItem(laptop);
        recentlyViewItems.addRecentlyViewedItem(mobilePhone);
        recentlyViewItems.addRecentlyViewedItem(earphones);
        recentlyViewItems.addRecentlyViewedItem(java);
        recentlyViewItems.addRecentlyViewedItem(tShirt);
        recentlyViewItems.addRecentlyViewedItem(earphones);

        for(Item item : recentlyViewItems.getRecentlyViewedItems()) {
            System.out.println(item.getName());
        }

//        Test Order and OrderProcessor

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(new Order("O1", true));
        orderProcessor.addOrder(new Order("O2", false));
        orderProcessor.addOrder(new Order("O3", false));
        orderProcessor.addOrder(new Order("O4", true));
        orderProcessor.addOrder(new Order("O5", false));

        while(orderProcessor.getSize() > 0){
            System.out.println(orderProcessor.processOrder().getOrderId());
        }
//        test sorting and filtering

        Inventory<Item> inventory2 = new Inventory<>();
        inventory2.add(laptop);
        inventory2.add(mobilePhone);
        inventory2.add(earphones);
        inventory2.add(java);
        inventory2.add(tShirt);

        List<Item> affordableItems = inventory2.filterByPrice(0, 100.0);
        System.out.println("Affordable items");
        for (Item item : affordableItems) {
            System.out.println(item.getName());
        }

        List<Item> availableItems = inventory2.filterByAvailability();
        System.out.println("Available items");
        for (Item item : availableItems) {
            System.out.println(item.getName());
        }

        List<Item> sortedItems = inventory2.sortItems(new ItemQuantityComparator());
        System.out.println("Sorted items");
        for (Item item : sortedItems) {
            System.out.println(item.getName());
        }

//        WishList testing

        WishList wishList = new WishList();

        wishList.addItem(laptop);
        wishList.addItem(mobilePhone);
        wishList.addItem(earphones);

        System.out.println("Wish list");
        for (Item item : wishList.getWishListItems()){
            System.out.println(item.getName());
        }
    }
}
