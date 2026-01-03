package com.day1.hospitalpatientmanagementsystem;

class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(String name, int age, String medicalHistory, int daysAdmitted) {
        super(name, age, medicalHistory);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient admitted for " + daysAdmitted + " days");
    }
}

