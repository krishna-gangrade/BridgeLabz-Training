package com.encapsulation.hospitalpatientmanagement;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private double treatmentCost;

    private String diagnosis;

    OutPatient(int id, String name, int age,
               double consultationFee, double treatmentCost) {
        super(id, name, age);
        this.consultationFee = consultationFee;
        this.treatmentCost = treatmentCost;
    }

    @Override
    double calculateBill() {
        return consultationFee + treatmentCost;
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