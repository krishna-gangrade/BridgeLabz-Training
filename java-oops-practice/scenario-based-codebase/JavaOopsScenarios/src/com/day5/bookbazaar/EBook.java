package com.day5.bookbazaar;

class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }
    
    @Override
    public String getBookType() {
        return "E-Book";
    }


    @Override
    public double applyDiscount(int quantity) {
        return price * quantity * 0.15; // 15% discount
    }
}