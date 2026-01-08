package com.day5.bookbazaar;

class Order {

    private Book[] books;
    private int[] quantities;
    private int count;
    private double totalCost;
    private String status;

    public Order(int size) {
        books = new Book[size];
        quantities = new int[size];
        status = "CREATED";
    }

    public void addBook(Book book, int quantity) {

        if (!book.reduceStock(quantity)) {
            System.out.println("❌ Not enough stock for " + book.getTitle());
            return;
        }

        books[count] = book;
        quantities[count] = quantity;
        count++;
    }

    private void calculateTotal() {
        totalCost = 0;

        for (int i = 0; i < count; i++) {
            double price = books[i].getPrice() * quantities[i];
            double discount = books[i].applyDiscount(quantities[i]);
            totalCost += (price - discount);
        }
    }

    void confirmOrder() {
        status = "CONFIRMED";
    }

    public void generateBill() {
        calculateTotal();
        confirmOrder();

        System.out.println("\n===== BookBazaar Bill =====");
        for (int i = 0; i < count; i++) {
            System.out.println(
                books[i].getTitle() +
                " x " + quantities[i] +
                " = ₹" + (books[i].getPrice() * quantities[i])
            );
        }
        System.out.println("Total Payable: ₹" + totalCost);
        System.out.println("Order Status: " + status);
    }
}