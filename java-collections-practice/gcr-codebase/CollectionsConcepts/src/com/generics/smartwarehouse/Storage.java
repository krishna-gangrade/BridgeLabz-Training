
package com.generics.smartwarehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Wildcard method
    public static void displayAllItems(List<? extends WarehouseItem> itemList) {
        for (WarehouseItem item : itemList) {
            item.displayItemDetails();
        }
    }
}
