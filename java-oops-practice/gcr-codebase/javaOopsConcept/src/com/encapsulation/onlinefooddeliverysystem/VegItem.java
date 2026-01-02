
package com.encapsulation.onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}
