package com.encapsulation.onlinefooddeliverysystem;

public class Main {

    public static void main(String[] args) {

        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 250, 2),
            new NonVegItem("Chicken Biryani", 300, 1)
        };

        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount(total);
                System.out.println(d.getDiscountDetails());
            }

            double finalAmount = total - discount;

            System.out.println("Total Price : ₹" + total);
            System.out.println("Discount    : ₹" + discount);
            System.out.println("Payable     : ₹" + finalAmount);
            System.out.println("--------------------------------");
        }
    }
}