package com.objectmodelling.library;

import java.util.ArrayList;

public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    // Constructor creates empty book list
    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<Book>();
    }

    // Aggregation: accepting already created Book objects
    public void includeBook(Book book) {
        books.add(book);
    }

    // Show all books present in the library
    public void listAllBooks() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("---------------------------");

        if (books.isEmpty()) {
            System.out.println("No books available");
        } else {
            for (Book book : books) {
                book.displayBookInfo();
                System.out.println();
            }
        }
    }
}