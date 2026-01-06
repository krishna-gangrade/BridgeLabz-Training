package com.day3.swiftcart;

abstract class Product {

    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Polymorphic discount
    public abstract double getDiscount(double total);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}