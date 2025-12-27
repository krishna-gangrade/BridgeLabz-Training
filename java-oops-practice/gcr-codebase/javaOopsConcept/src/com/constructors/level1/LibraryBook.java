package com.constructors.level1;

public class LibraryBook {
	
	// Attributes
    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : ₹" + price);
        System.out.println("Availability : " + availability);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 550);

        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook(); // second attempt
        book1.displayDetails();

	}

}
