package com.constructorandaccessmodifier.level1;

public class Book {

    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {

        Book book1 = new Book();  
        Book book2 = new Book("Java Basics", "James Gosling", 499.99);

        book1.display();
        book2.display();
    }
}
