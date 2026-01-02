
package com.encapsulation.onlinefooddeliverysystem;

abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method
    abstract double calculateTotalPrice();

    // Concrete method
    void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price    : ₹" + price);
        System.out.println("Quantity : " + quantity);
    }
}
