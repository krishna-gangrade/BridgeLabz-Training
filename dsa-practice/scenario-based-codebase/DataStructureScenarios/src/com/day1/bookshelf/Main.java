
package com.day1.bookshelf;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LibrarySystem library = new LibrarySystem();

		// Existing Books
		library.existingBook(new Book(101, "1984", "George Orwell", "Fiction"));
		library.existingBook(new Book(102, "Pride and Prejudice", "Jane Austen", "Fiction"));
		library.existingBook(new Book(103, "To Kill a Mockingbird", "Harper Lee", "Fiction"));
		
		library.existingBook(new Book(104, "The Lord of the Rings", "J. R. R. Tolkien", "Fantasy"));
		library.existingBook(new Book(105, "Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Fantasy"));
		library.existingBook(new Book(106, "The Hobbit", "J. R. R. Tolkien", "Fantasy"));

		library.existingBook(new Book(107, "The Da Vinci Code", "Dan Brown", "Mystery"));
		library.existingBook(new Book(108, "Gone Girl", "Gillian Flynn", "Thriller"));
		library.existingBook(new Book(109, "Sherlock Holmes", "Arthur Conan Doyle", "Mystery"));

		library.existingBook(new Book(110, "Me Before You", "Jojo Moyes", "Romance"));
		library.existingBook(new Book(111, "The Fault in Our Stars", "John Green", "Romance"));

		library.existingBook(new Book(112, "Dune", "Frank Herbert", "Science Fiction"));
		library.existingBook(new Book(113, "The Martian", "Andy Weir", "Science Fiction"));

		library.existingBook(new Book(114, "A Brief History of Time", "Stephen Hawking", "Science"));
		library.existingBook(new Book(115, "The Selfish Gene", "Richard Dawkins", "Science"));
		library.existingBook(new Book(116, "Cosmos", "Carl Sagan", "Science"));

		library.existingBook(new Book(117, "Sapiens", "Yuval Noah Harari", "History"));
		library.existingBook(new Book(118, "Guns, Germs, and Steel", "Jared Diamond", "History"));

		library.existingBook(new Book(119, "The Diary of a Young Girl", "Anne Frank", "Biography"));
		library.existingBook(new Book(120, "Wings of Fire", "A. P. J. Abdul Kalam", "Autobiography"));

		// Self-Help
		library.existingBook(new Book(121, "Atomic Habits", "James Clear", "Self Help"));
		library.existingBook(new Book(122, "The Power of Habit", "Charles Duhigg", "Self Help"));

		// Indian Fiction
		library.existingBook(new Book(123, "Malgudi Days", "R. K. Narayan", "Indian Fiction"));
		library.existingBook(new Book(124, "Five Point Someone", "Chetan Bhagat", "Indian Fiction"));
		library.existingBook(new Book(125, "The White Tiger", "Aravind Adiga", "Indian Fiction"));

		// Header for the SYstem
		System.out.println("======================================");
		System.out.println("||         Library System           ||");
		System.out.println("======================================\n ");

		
		int choice ;
		
		do {
            library.displayMenu();
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    library.displayGenres();
                    break;

                case 2:
                    System.out.print("Enter genre: ");
                    String genre = sc.nextLine();
                    library.displayByGenre(genre);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter genre: ");
                    String newGenre = sc.nextLine();

                    library.addBook(new Book(id, title, author, newGenre));
                    break;

                case 4:
                    System.out.print("Enter book ID: ");
                    int borrowId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter genre: ");
                    String borrowGenre = sc.nextLine();

                    library.borrowBook(borrowId, borrowGenre);
                    break;

                case 5:
                    System.out.print("Enter book ID: ");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);
                    break;

                case 0:
                    System.out.println("Exiting Library System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
