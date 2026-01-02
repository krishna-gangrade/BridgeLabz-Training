package com.encapsulation.librarymanagementsystem;

public class Main {

    public static void main(String[] args) {

        LibraryItem[] items = {
            new Book(1, "Clean Code", "Robert C. Martin"),
            new Magazine(2, "National Geographic", "NG Team"),
            new DVD(3, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration : " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            r.reserveItem("User123");

            System.out.println("Available     : " + r.checkAvailability());
            System.out.println(r.getBorrowerInfo());

            System.out.println("--------------------------------");
        }
    }
}