package com.day3.swiftcart;

class Cart implements ICheckout {

    private Product[] products;
    private int[] quantities;
    private int count;
    private double totalPrice;

    // Empty cart
    public Cart(int size) {
        products = new Product[size];
        quantities = new int[size];
    }

    // Cart with pre-selected items
    public Cart(Product[] products, int[] quantities) {
        this.products = products;
        this.quantities = quantities;
        this.count = products.length;
        calculateTotal();
    }

    // Only Cart can update prices
    private void calculateTotal() {
        totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice += products[i].getPrice() * quantities[i];
        }
    }

    public void addProduct(Product product, int quantity) {
        products[count] = product;
        quantities[count] = quantity;
        count++;
        calculateTotal();
    }

    @Override
    public void applyDiscount() {
        double discount = 0;
        for (int i = 0; i < count; i++) {
            discount += products[i].getDiscount(
                    products[i].getPrice() * quantities[i]);
        }
        totalPrice -= discount;
    }

    @Override
    public void generateBill() {
        System.out.println("\n--- SwiftCart Bill ---");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].getName() +
                    " x " + quantities[i] +
                    " = ₹" + (products[i].getPrice() * quantities[i]));
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}