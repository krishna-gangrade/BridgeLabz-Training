package com.inheritance.hybrid.restaurantmanagementsystem;

public class Main {

    public static void main(String[] args) {

        Person[] staff = {
            new Chef("Ramesh", 101),
            new Waiter("Amit", 102)
        };

        for (Person p : staff) {
            p.displayInfo();

            Worker w = (Worker) p;   // Interface reference
            w.performDuties();

            System.out.println("--------------------------------");
        }
    }
}