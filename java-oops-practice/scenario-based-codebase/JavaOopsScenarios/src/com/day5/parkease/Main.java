package com.day5.parkease;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingSlot[] slots = {
            new ParkingSlot(1, "Basement A", "Car"),
            new ParkingSlot(2, "Basement A", "Bike"),
            new ParkingSlot(3, "Basement B", "Truck")
        };

        System.out.println(" Welcome to ParkEase ");

        System.out.print("Enter vehicle type (Car/Bike/Truck): ");
        String type = sc.nextLine();

        System.out.print("Enter vehicle number: ");
        String number = sc.nextLine();

        Vehicle vehicle;
        switch (type.toLowerCase()) {
            case "car" -> vehicle = new Car(number);
            case "bike" -> vehicle = new Bike(number);
            case "truck" -> vehicle = new Truck(number);
            default -> {
                System.out.println("Invalid vehicle type.");
                sc.close();
                return;
            }
        }

        ParkingSlot assignedSlot = null;
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable() && slot.parkVehicle(vehicle)) {
                assignedSlot = slot;
                break;
            }
        }

        if (assignedSlot == null) {
            System.out.println(" No parking slot available.");
            sc.close();
            return;
        }

        System.out.println(" Vehicle parked in Slot " + assignedSlot.getSlotId());
        System.out.println(assignedSlot.getBookingLog());

        System.out.print("Enter parking duration (hours): ");
        int hours = sc.nextInt();

        double charges = vehicle.calculateCharges(hours);

        assignedSlot.releaseSlot();

        System.out.println("\n Parking Charges: Rs. " + charges);
        System.out.println("Slot released. Thank you for using ParkEase!");

        sc.close();
    }
}