/* 1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records  */



package com.day4.hospitalqueue;

import java.util.ArrayList;

public class HospitalQueueApp {

    // Bubble Sort by criticality (descending order)
    public static void sortByCriticality(ArrayList<Patient> patients) {
        int n = patients.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (patients.get(j).criticality < patients.get(j + 1).criticality) {
                    // Swap adjacent patients
                    Patient temp = patients.get(j);
                    patients.set(j, patients.get(j + 1));
                    patients.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient("Ravi", 4));
        patients.add(new Patient("Anita", 9));
        patients.add(new Patient("Karan", 6));
        patients.add(new Patient("Meena", 10));

        sortByCriticality(patients);

        // Display sorted patients
        for (Patient p : patients) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }
}