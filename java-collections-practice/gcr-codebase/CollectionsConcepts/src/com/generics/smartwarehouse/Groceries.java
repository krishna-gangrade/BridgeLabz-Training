package com.generics.smartwarehouse;

public class Groceries extends WarehouseItem {

    public Groceries(String itemName, double itemPrice) {
        super(itemName, itemPrice);
    }

    @Override
    public void displayItemDetails() {
        System.out.println("[GROCERIES] Item = " + getItemName()
                + ", Cost = Rs." + getItemPrice());
    }

}