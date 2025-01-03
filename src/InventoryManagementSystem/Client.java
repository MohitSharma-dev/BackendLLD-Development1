package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        Clothing tShirt = new Clothing("C1", "T-Shirt", 19.99, 100, "M");
        Book java = new Book("B1", "Java Programming", 1599.99, 0, "John Doe");

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

        Electronics laptop = new Electronics("E1", "Laptop", 0, 5, 24);
        Electronics mobilePhone = new Electronics("E2", "Mobile", 5000, 10, 12);
        Electronics earphones = new Electronics("E3", "Earphones", 500, 0, 12);

        try {
            inventory.add(laptop);
            inventory.add(mobilePhone);
            inventory.add(earphones);
        } catch (InvalidQuantityException ex){
            System.out.println(ex.getMessage());
        }

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
//        opened the db connection
        try {
            inventory2.add(laptop);
            inventory2.add(mobilePhone);
            inventory2.add(earphones);
            inventory2.add(java);
            inventory2.add(tShirt);
//            trying to do something with db
        } catch (InvalidQuantityException ex){

            System.out.println(ex.getMessage());
        } finally {
//            finally block is always implemented after the try and catch
            System.out.println("Closing the db connection");
        }

        System.out.println("Closing the db connection");

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

        List<Item> itemsList1 = inventory2.getAll();
        System.out.println(itemsList1.size());
        System.out.println("Printing all items id in the inventory");

//        Print all item IDs in the inventory using map.
        itemsList1
                .stream()
                .map(item -> item.getId())
                .forEach(id -> System.out.println(id));

//        Create a list of item names in lowercase and print it.
        List<String> ans =
                itemsList1
                .stream()
                .map(item -> item.getName().toLowerCase())
                .collect(Collectors.toList());
        System.out.println(ans);

//        Generate a list of the lengths of item names
        List<Integer> ans1 =
                itemsList1
                        .stream()
                        .map(item -> item.getName().length())
                        .collect(Collectors.toList());
        System.out.println(ans1);

//        Find all items priced above 1000 and print their details.
        itemsList1
                .stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach(item -> System.out.println(item.getName()));

//        Check if any item in the inventory has a quantity of 0 using anyMatch.

    boolean isItemOutOfStock =
            itemsList1
                .stream()
                .anyMatch(item -> item.getQuantity() == 0);

        System.out.println(isItemOutOfStock);
//        Verify that all items have a price greater than 0 using allMatch.
        boolean allItemsHasAPriceToPay =  itemsList1
                .stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println(allItemsHasAPriceToPay);

//        Confirm that no item has a negative quantity using noneMatch
         itemsList1
                .stream()
                .noneMatch(item -> item.getQuantity() < 0);

//        Assume the inventory contains various items (e.g., electronics, clothing, books) with attributes like name, price, quantity, and tags. Write a program to achieve the following:
         List<String> ans3 =   itemsList1
                    .stream()
//        Filter items with a price greater than 1000 and a quantity greater than 0 (available stock).
                    .filter(item -> item.getPrice() > 1000 && item.getQuantity() > 0)
//        Extract only the names of these items.
                    .map(item -> item.getName())
//        Remove duplicate names (if any).
                    .distinct()
//        Sort the names in alphabetical order.
                    .sorted()
//        Limit the result to the top 5 names.
                    .limit(5)
//        Collect the final list into a List<String> and print it.
                    .collect(Collectors.toList());


//        Calculate the total quantity of all items in the inventory.

            int total = 0;
            for(Item item : itemsList1) {
                total += item.getQuantity();
            }

            int total1 = itemsList1
                    .stream()
                    .map(item -> item.getQuantity())
                    .reduce(0, (totalSum , quantity) -> {
                        totalSum = totalSum + quantity;
                        return totalSum;
                    });
            System.out.println(total1);

//        Find the most expensive item using reduce.

        Item mostExpensiveItem = itemsList1.get(0);
        for(Item item : itemsList1) {
            if(item.getPrice() > mostExpensiveItem.getPrice()) {
                mostExpensiveItem = item;
            }
        }

       Optional<Item> mostExpensive = itemsList1
                .stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);

        System.out.println(mostExpensive.get().getName());

//        Concatenate all item names into a single comma-separated string.
        Optional<String> stringAns = itemsList1
                .stream()
                .map(item -> item.getName())
                .reduce((concatedString , name) -> {
                    concatedString = concatedString + ", " + name;
                    return concatedString;
                });

        System.out.println(stringAns.get());


    }
}
