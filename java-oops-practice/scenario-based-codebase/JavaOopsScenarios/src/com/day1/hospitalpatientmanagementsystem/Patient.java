package com.day1.hospitalpatientmanagementsystem;

class Patient {
    private String name;
    private int age;
    private String medicalHistory; 

    
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    
    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    
    public String getSummary() {
    	String historyStatus = (medicalHistory == null) ? "Not Provided" : "Available (Confidential)" ;
        return "Patient Name: " + name + ", Age: " + age +" Medical History :" +historyStatus ;
    }


    public void displayInfo() {
        System.out.println("Patient: " + name);
    }
}
