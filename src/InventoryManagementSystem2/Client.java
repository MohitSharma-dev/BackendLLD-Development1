package InventoryManagementSystem2;


import IntroToOOP.Student;

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

        Collections.sort(items);
        System.out.println("Checking the comparable sorting : ");
        for(Item item : items) {
            System.out.println(item.getName());
        }

//        Inventory
//        diff objects : specific items
//        Inventory of electronics
//        Inventory of Clothing
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1", "Laptop", 999.99, 5, 24));
        electronicsInventory.add(new Electronics("E2", "Laptop", 999.99, 5, 24));
        electronicsInventory.add(new Electronics("E3", "Mobile", 99.99, 5, 24));

        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();

        Inventory<Item> itemInventory = new Inventory<>();

//        Inventory<Student> studentInventory = new Inventory<>();

//        Recently Viewed Items
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(new Order("O1" , true, 50));
        orderProcessor.addOrder(new Order("O2" , false, 500));
        orderProcessor.addOrder(new Order("O3" , true, 10));

        while(orderProcessor.size() > 0){
            Order order = orderProcessor.processOrder();
            System.out.println(order.getOrderId() + " " + order.getTotalAmount());
        }

        orderProcessor.setComparator(new OrderTotalAmountComparator());

        orderProcessor.addOrder(new Order("O1" , true, 50));
        orderProcessor.addOrder(new Order("O2" , false, 500));
        orderProcessor.addOrder(new Order("O3" , true, 10));

        while(orderProcessor.size() > 0){
            Order order = orderProcessor.processOrder();
            System.out.println(order.getOrderId() + " " + order.getTotalAmount());
        }
    }
}

//   Tide imac sonata

// linkedList

// iphone
// imac
// sonata watch
// Tide detergent
// imac
// sonata watch

