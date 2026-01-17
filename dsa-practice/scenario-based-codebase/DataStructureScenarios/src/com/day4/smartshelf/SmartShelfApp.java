/*  2. SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title  */

package com.day4.smartshelf;

import java.util.ArrayList;

public class SmartShelfApp {
	// Insertion Sort by book title (alphabetical order)
	public static void insertionSortByTitle(ArrayList<Book> books) {
		for (int i = 1; i < books.size(); i++) {
			Book key = books.get(i);
			int j = i - 1;

			// Shift books that are greater than key.title
			while (j >= 0 && books.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
				books.set(j + 1, books.get(j));
				j--;
			}

			// Insert book at correct position
			books.set(j + 1, key);
		}
	}

	public static void main(String args[]) {
		ArrayList<Book> shelf = new ArrayList<>();

		// Simulating adding books one by one
		shelf.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
		shelf.add(new Book("1984", "George Orwell"));
		shelf.add(new Book("To Kill a Mockingbird", "Harper Lee"));
		shelf.add(new Book("Brave New World", "Aldous Huxley"));

		// Display sorted shelf
		System.out.println("Books on the Smart Shelf (sorted by title):");
		for (Book book : shelf) {
			System.out.println(book);
		}
	}

}