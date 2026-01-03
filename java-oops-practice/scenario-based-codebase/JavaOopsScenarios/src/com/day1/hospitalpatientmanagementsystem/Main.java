/*

1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.

*/


package com.day1.hospitalpatientmanagementsystem;

public class Main {
    public static void main(String[] args) {

        // Doctor
        Doctor doctor = new Doctor("Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        // Normal Patient
        Patient p1 = new OutPatient("Rahul", 25);
        System.out.println(p1.getSummary());
        p1.displayInfo();

        // Emergency Patient
        Patient p2 = new InPatient("Anjali", 30, "Heart Issue", 5);
        System.out.println(p2.getSummary());
        p2.displayInfo();

        // Billing
        Payable bill1 = new Bill(5000, false);
        Payable bill2 = new Bill(5000, true);

        System.out.println("Normal Bill Amount: ₹" + bill1.calculatePayment());
        System.out.println("Emergency Bill Amount: ₹" + bill2.calculatePayment());
    }
}
