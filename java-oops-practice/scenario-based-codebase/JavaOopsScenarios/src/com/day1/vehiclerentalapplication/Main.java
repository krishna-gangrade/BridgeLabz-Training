package com.day1.vehiclerentalapplication;

/*

2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters

*/

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Rahul");

        Rentable bike = new Bike("BIKE-101");
        Rentable car = new Car("CAR-202");
        Rentable truck = new Truck("TRUCK-303");

        int days = 3;

        System.out.println("Customer: " + customer.getName());

        System.out.println("Bike Rent for " + days + " days: ₹" + bike.calculateRent(days));
        System.out.println("Car Rent for " + days + " days: ₹" + car.calculateRent(days));
        System.out.println("Truck Rent for " + days + " days: ₹" + truck.calculateRent(days));
    }
}

