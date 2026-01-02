package com.inheritance.hybrid.vehiclemanagementsystem;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new ElectricVehicle("Tesla Model 3", 200);
        Vehicle v2 = new PetrolVehicle("Honda City", 180);

        v1.displayInfo();
        ((ElectricVehicle) v1).charge();
        System.out.println("--------------------------------");

        v2.displayInfo();
        Refuelable r = (Refuelable) v2;
        r.refuel();
    }
}