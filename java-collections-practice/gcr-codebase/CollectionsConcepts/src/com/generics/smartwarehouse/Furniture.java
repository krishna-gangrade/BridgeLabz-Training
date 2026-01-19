package com.generics.smartwarehouse;

public class Furniture extends WarehouseItem {

    public Furniture(String itemName, double itemPrice) {
        super(itemName, itemPrice);
    }

    @Override
    public void displayItemDetails() {
        System.out.println("[FURNITURE] Item = " + getItemName()
                + ", Cost = Rs." + getItemPrice());
    }

}