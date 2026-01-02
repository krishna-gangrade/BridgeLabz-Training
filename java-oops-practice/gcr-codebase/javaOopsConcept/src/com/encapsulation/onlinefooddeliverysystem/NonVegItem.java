package com.encapsulation.onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {

    private static final double NON_VEG_CHARGE = 50;

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}