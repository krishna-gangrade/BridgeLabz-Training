package com.day5.bookbazaar;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Inventory
        Book[] inventory = {
            new PrintedBook("Clean Code", "Robert C. Martin", 500, 10),
            new PrintedBook("Java Complete Reference", "Herbert Schildt", 650, 5),
            new EBook("Effective Java", "Joshua Bloch", 400),
            new EBook("Spring in Action", "Craig Walls", 350)
        };

        Order order = new Order(10);

        System.out.println("📚 Welcome to BookBazaar");

        while (true) {
        	System.out.println("\nAvailable Books:");
        	for (int i = 0; i < inventory.length; i++) {

        	    String stockDisplay =
        	        inventory[i].getStock() == Integer.MAX_VALUE
        	            ? "Unlimited"
        	            : String.valueOf(inventory[i].getStock());

        	    System.out.println(
        	        (i + 1) + ". " +
        	        inventory[i].getTitle() +
        	        " | Type: " + inventory[i].getBookType() +
        	        " | Price: ₹" + inventory[i].getPrice() +
        	        " | Stock: " + stockDisplay
        	    );
        	}

            System.out.print("\nChoose book number (0 to checkout): ");
            int choice = sc.nextInt();

            if (choice == 0) break;

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            order.addBook(inventory[choice - 1], qty);
        }

        order.generateBill();
        sc.close();
    }
}