package com.day4.hospitalqueue;

class Patient {
    String name;
    int criticality; // 1–10

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }
}