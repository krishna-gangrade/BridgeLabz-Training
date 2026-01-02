package com.encapsulation.ecommerceplatform;

class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax(double price) {
        return price * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "GST @12%";
    }
}