package com.day5.bookbazaar;

class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }
    
    @Override
    public String getBookType() {
        return "Printed Book";
    }


    @Override
    public double applyDiscount(int quantity) {
        if (quantity >= 3) {
            return price * quantity * 0.10; // 10% discount
        }
        return 0;
    }
}