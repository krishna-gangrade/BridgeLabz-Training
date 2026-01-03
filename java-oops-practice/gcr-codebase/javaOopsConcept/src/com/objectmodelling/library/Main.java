package com.objectmodelling.library;

public class Main {

    public static void main(String[] args) {

        // Book objects created independently
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("Java Complete Reference", "Herbert Schildt");

        // Library objects
        Library centralLibrary = new Library("Central Library");
        Library digitalLibrary = new Library("Digital Library");

        // Aggregation: same book added to different libraries
        centralLibrary.includeBook(book1);
        centralLibrary.includeBook(book2);

        digitalLibrary.includeBook(book2);
        digitalLibrary.includeBook(book3);

        // Display library contents
        centralLibrary.listAllBooks();
        System.out.println();
        digitalLibrary.listAllBooks();
    }
}