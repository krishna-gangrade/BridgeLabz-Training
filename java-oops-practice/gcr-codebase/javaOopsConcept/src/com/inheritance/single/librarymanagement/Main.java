package com.inheritance.single.librarymanagement;

public class Main {

    public static void main(String[] args) {

        Book book = new Author(
                "The Art of Learning",
                2021,
                "Rohit Mehra",
                "Writes practical guides focused on skill development and learning strategies."
        );

        book.displayInfo();
    }
}