package com.day1.bookshelf;

public class Book {

    int id;
    String title;
    String author;
    String genre;
    boolean isBorrowed;

    public Book(int id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isBorrowed = false; // available by default
    }
}