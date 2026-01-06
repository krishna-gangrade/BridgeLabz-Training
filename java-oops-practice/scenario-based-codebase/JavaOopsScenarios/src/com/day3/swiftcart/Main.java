package com.day3.swiftcart;

class Main {

    public static void main(String[] args) {

        // Products
        Product apple = new PerishableProduct("Apple", 50);
        Product milk = new PerishableProduct("Milk", 40);
        Product rice = new NonPerishableProduct("Rice", 60);

        // Cart
        Cart cart = new Cart(5);

        // Add items
        cart.addProduct(apple, 2); // price * quantity
        cart.addProduct(milk, 1);
        cart.addProduct(rice, 3);

        // Checkout
        cart.applyDiscount();   // polymorphic discount
        cart.generateBill();
    }
}