
package com.encapsulation.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 400 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy : ****" +
                insurancePolicyNumber.substring(
                        insurancePolicyNumber.length() - 3
                );
    }
}
