package com.encapsulation.hospitalpatientmanagement;

public class Main {

    public static void main(String[] args) {

        Patient[] patients = {
            new InPatient(101, "Amit", 45, 5, 2000, 15000),
            new OutPatient(102, "Riya", 30, 500, 3000)
        };

        for (Patient p : patients) {

            p.getPatientDetails();

            MedicalRecord record = (MedicalRecord) p;
            record.addRecord("Flu");

            System.out.println(record.viewRecords());
            System.out.println("Total Bill : ₹" + p.calculateBill());
            System.out.println("--------------------------------");
        }
    }
}