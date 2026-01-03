package com.objectmodelling.library;

public class Book {

    private String title;
    private String author;

    // Constructor for initializing book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
    }
}