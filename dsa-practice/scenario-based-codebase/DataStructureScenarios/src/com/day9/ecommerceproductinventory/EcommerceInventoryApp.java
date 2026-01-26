
/*
1. Binary Search Tree (BST)
Story: E-Commerce Product Inventory
	An online store categorizes products by SKU numbers.
Scenarios:
	● 🔹 Scenario 1: Lookup — Customers search for a product using SKU.
	● 🔹 Scenario 2: Price Update — Admin updates products using SKU key.
	● 🔹 Scenario 3: Sorted List — Display all products in sorted SKU order.
*/

package com.day9.ecommerceproductinventory;

public class EcommerceInventoryApp {
    public static void main(String[] args) {
        ProductBST inventory = new ProductBST();

        System.out.println("=================================================================");
        System.out.println("                  E-COMMERCE PRODUCT INVENTORY");
        System.out.println("=================================================================");

        // Adding products (new arrivals)
        inventory.insert(new Product("A001", "Lenovo ThinkPad X1", 124999.00, 15));
        inventory.insert(new Product("B202", "Google Pixel 8 Pro", 119900.00, 12));
        inventory.insert(new Product("C896", "OnePlus Pad Pro", 100020.00, 20));
        inventory.insert(new Product("A209", "Bose QuietComfort Ultra", 29990.00, 35));
        inventory.insert(new Product("B119", "HP Spectre x360", 114900.00, 12));

        System.out.println("All products in sorted SKU order:");
        inventory.printSorted();

        // Scenario 1: Customer lookup
        System.out.println("\nCustomer searching for SKU: B202");
        Product found = inventory.lookup("B202");
        
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Product not found");
        }

        // Scenario 2: Admin updates price
        System.out.println("\nAdmin updating price of A209...");
        boolean updated = inventory.updatePrice("A209", 119999.00);
        
        if (updated) {
            System.out.println("Price updated successfully!");
        }

        // Show updated sorted list
        System.out.println("\nUpdated inventory (sorted by SKU):");
        inventory.printSorted();

        System.out.println("\nTotal products in catalog: " + inventory.getProductCount());
        System.out.println("=================================================================");
    }
}
