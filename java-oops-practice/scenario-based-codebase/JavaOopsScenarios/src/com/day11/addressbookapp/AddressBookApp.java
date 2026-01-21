
/*
Smart Contact Manager
OOP Concepts:
    Classes, Objects, Encapsulation, Constructors, Access Modifiers, Collections

Scenario:
    You are working with ConnectSphere Solutions, a startup developing tools to
    manage personal and professional contacts digitally.

Each Contact includes:
    ● First Name, Last Name
    ● Phone Number, Email
    ● Address (optional: City, State, Zip)

Problem Statement:
    Develop a Java application that:
        ● Adds a new contact (with duplicate validation)
        ● Edits an existing contact by name
        ● Deletes a contact by name
        ● Searches contacts by city or state
        ● Displays all contacts sorted alphabetically
        ● Stores contacts in an in-memory structure like ArrayList<Contact>

Uses:
    ● Classes and constructors
    ● Encapsulation
    ● Composition (Address class)
*/

package com.day11.addressbookapp;

public class AddressBookApp {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        // Added example contacts (CHANGED DETAILS)
        book.addContact(new Contact(
                "Rohan", "Mehta", "9123456780", "rohan.mehta@gmail.com",
                new Address("Indore", "Madhya Pradesh", "452001")
        ));

        book.addContact(new Contact(
                "Sneha", "Kulkarni", "9876543210", "sneha.k@gmail.com",
                new Address("Pune", "Maharashtra", "411001")
        ));

        book.addContact(new Contact(
                "Vikram", "Iyer", "9012345678", "vikram.iyer@yahoo.com",
                new Address("Chennai", "Tamil Nadu", "600028")
        ));

        book.addContact(new Contact(
                "Neha", "Arora", "8899001122", "neha.arora@gmail.com",
                null   // no address
        ));

        System.out.println("All Contacts (sorted):");
        System.out.println("---------------------------------------------------------------");
        for (Contact c : book.getSortedContacts()) {
            System.out.println(c);
        }
        System.out.println("Total contacts: " + book.getContactCount() + "\n");

        // Try adding duplicate
        boolean added = book.addContact(
                new Contact("Rohan", "Mehta", "7777777777", "duplicate@gmail.com", null)
        );
        System.out.println("Trying to add duplicate Rohan Mehta -> " +
                (added ? "Success" : "Failed (duplicate)"));

        // Search by city/state
        System.out.println("\nContacts from Maharashtra:");
        for (Contact c : book.searchByLocation("Maharashtra")) {
            System.out.println(c);
        }

        // Edit example
        Contact updated = new Contact("", "", "9998887776", "neha.updated@gmail.com", null);
        boolean edited = book.editContact("Neha", "Arora", updated);
        System.out.println("\nEditing Neha Arora phone & email -> " +
                (edited ? "Success" : "Failed"));

        // Show updated list
        System.out.println("\nUpdated Contact List:");
        for (Contact c : book.getSortedContacts()) {
            System.out.println(c);
        }

        // Delete
        boolean deleted = book.deleteContact("Vikram", "Iyer");
        System.out.println("\nDeleting Vikram Iyer -> " +
                (deleted ? "Success" : "Failed"));

        System.out.println("Remaining contacts: " + book.getContactCount());
    }
}
