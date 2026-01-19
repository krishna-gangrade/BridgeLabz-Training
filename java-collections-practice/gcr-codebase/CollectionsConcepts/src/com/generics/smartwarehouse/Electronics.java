package com.generics.smartwarehouse;

public class Electronics extends WarehouseItem {

    public Electronics(String itemName, double itemPrice) {
        super(itemName, itemPrice);
    }

    @Override
    public void displayItemDetails() {
        System.out.println("[ELECTRONICS] Item = " + getItemName()
                + ", Cost = Rs." + getItemPrice());
    }

}