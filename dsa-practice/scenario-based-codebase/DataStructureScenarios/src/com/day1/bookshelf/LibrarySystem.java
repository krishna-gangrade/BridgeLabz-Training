
package com.day1.bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class LibrarySystem {

    private HashMap<String, LinkedList<Book>> library = new HashMap<>();
    private HashMap<Integer, Book> borrowedBooks = new HashMap<>();
    private HashSet<Integer> bookIds = new HashSet<>();

    // Menu
    public void displayMenu() {
        System.out.println("\n===== LIBRARY MENU =====");
        System.out.println("1. Check all Genres");
        System.out.println("2. Check Books by Genre");
        System.out.println("3. Add Book");
        System.out.println("4. Borrow Book");
        System.out.println("5. Return Book");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    // Add existing books (initial load)
    public void existingBook(Book book) {
        bookIds.add(book.id);
        library.putIfAbsent(book.genre, new LinkedList<>());
        library.get(book.genre).add(book);
    }

    // Add new book
    public void addBook(Book book) {

        if (bookIds.contains(book.id)) {
            System.out.println("Duplicate book ID not allowed");
            return;
        }

        bookIds.add(book.id);
        library.putIfAbsent(book.genre, new LinkedList<>());
        library.get(book.genre).add(book);

        System.out.println("Book added successfully");
    }

    // Borrow book
    public void borrowBook(int bookId, String genre) {

        LinkedList<Book> list = library.get(genre);
        if (list == null) {
            System.out.println("Genre not found");
            return;
        }

        for (Book book : list) {
            if (book.id == bookId) {

                if (book.isBorrowed) {
                    System.out.println("Book already borrowed");
                    return;
                }

                book.isBorrowed = true;
                borrowedBooks.put(bookId, book);
                System.out.println("Borrowed: " + book.title);
                return;
            }
        }
        System.out.println("Book not found");
    }

    // Return book
    public void returnBook(int bookId) {

        Book book = borrowedBooks.remove(bookId);
        if (book == null) {
            System.out.println("Invalid return");
            return;
        }

        book.isBorrowed = false;
        System.out.println("Returned: " + book.title);
    }

    // Display genres
    public void displayGenres() {

        if (library.isEmpty()) {
            System.out.println("No genres available");
            return;
        }

        System.out.println("\nGenres in library:");
        for (String genre : library.keySet()) {
            System.out.println("- " + genre);
        }
    }

    // Display books by genre with availability
    public void displayByGenre(String genre) {

        LinkedList<Book> list = library.get(genre);
        if (list == null || list.isEmpty()) {
            System.out.println("No books found");
            return;
        }

        System.out.println("\nBooks in " + genre + ":");
        System.out.println("-------------------------------------");

        for (Book book : list) {
            System.out.println(
                "ID: " + book.id +
                ", Title: " + book.title +
                ", Author: " + book.author +
                ", Status: " + (book.isBorrowed ? "BORROWED" : "AVAILABLE")
            );
        }
    }
}
