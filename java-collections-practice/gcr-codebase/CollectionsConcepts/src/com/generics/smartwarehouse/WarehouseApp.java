
/* 1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
 */

package com.generics.smartwarehouse;

public class WarehouseApp {

    public static void main(String[] args) {

        // Electronics Storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Bluetooth Speaker", 4200));
        electronicsStorage.addItem(new Electronics("Wireless Headphones", 5800));
        electronicsStorage.addItem(new Electronics("Smart Watch", 12999));

        // Groceries Storage
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Wheat Flour", 980));
        groceriesStorage.addItem(new Groceries("Sugar", 55));
        groceriesStorage.addItem(new Groceries("Tea Powder", 430));
        groceriesStorage.addItem(new Groceries("Salt Pack", 28));

        // Furniture Storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Office Desk", 14500));
        furnitureStorage.addItem(new Furniture("Bookshelf", 8200));
        furnitureStorage.addItem(new Furniture("Sofa Set", 36500));

        System.out.println("===== SMART WAREHOUSE INVENTORY REPORT =====\n");

        System.out.println(">>> Electronics Inventory");
        Storage.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n>>> Groceries Inventory");
        Storage.displayAllItems(groceriesStorage.getItems());

        System.out.println("\n>>> Furniture Inventory");
        Storage.displayAllItems(furnitureStorage.getItems());
    }
}
