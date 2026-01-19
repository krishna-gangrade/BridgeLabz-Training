package com.generics.smartwarehouse;

public abstract class WarehouseItem {

    private String itemName;
    private double itemPrice;

    public WarehouseItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public abstract void displayItemDetails();
}