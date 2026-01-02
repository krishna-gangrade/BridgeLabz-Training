package com.inheritance.hybrid.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Charging the electric vehicle battery");
    }
}