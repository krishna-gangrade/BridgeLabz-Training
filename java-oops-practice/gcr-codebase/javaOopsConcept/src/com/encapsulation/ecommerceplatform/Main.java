
package com.encapsulation.ecommerceplatform;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Electronics(101, "Laptop", 60000),
            new Clothing(102, "Jacket", 3000),
            new Groceries(103, "Rice Bag", 1200)
        };

        for (Product p : products) {

            double basePrice = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax(basePrice);
            }

            double finalPrice = basePrice + tax - discount;

            System.out.println("Product Name : " + p.getName());
            System.out.println("Base Price  : ₹" + basePrice);
            System.out.println("Discount    : ₹" + discount);
            System.out.println("Tax         : ₹" + tax);
            System.out.println("Final Price : ₹" + finalPrice);
            System.out.println("--------------------------------");
        }
    }
}
