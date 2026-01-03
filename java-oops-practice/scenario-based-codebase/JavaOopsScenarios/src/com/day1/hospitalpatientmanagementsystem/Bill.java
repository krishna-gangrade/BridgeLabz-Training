package com.day1.hospitalpatientmanagementsystem;

class Bill implements Payable {
    private double baseAmount;
    private boolean isEmergency;

    public Bill(double baseAmount, boolean isEmergency) {
        this.baseAmount = baseAmount;
        this.isEmergency = isEmergency;
    }

    @Override
    public double calculatePayment() {
        double emergencyCharge = isEmergency ? 2000 : 0;
        double tax = baseAmount * 0.05;        // 5% tax
        double discount = baseAmount * 0.10;   // 10% discount

        return baseAmount + emergencyCharge + tax - discount;
    }
}
