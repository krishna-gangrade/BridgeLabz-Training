package com.encapsulation.hospitalpatientmanagement;

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyRoomCharge;
    private double treatmentCost;

    private String diagnosis; // sensitive data (encapsulated)

    InPatient(int id, String name, int age,
              int daysAdmitted, double dailyRoomCharge, double treatmentCost) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRoomCharge = dailyRoomCharge;
        this.treatmentCost = treatmentCost;
    }

    @Override
    double calculateBill() {
        return (daysAdmitted * dailyRoomCharge) + treatmentCost;
    }

    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String viewRecords() {
        return diagnosis == null
                ? "No medical record available"
                : "Diagnosis : ****" + diagnosis.substring(0, 1);
    }
}