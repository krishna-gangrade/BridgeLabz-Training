package com.day5.loanbuddy;

abstract class LoanApplication implements IApprovable {

    protected int termMonths;
    protected double interestRate;
    private boolean approved; // restricted access

    protected LoanApplication(int termMonths, double interestRate) {
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    // EMI formula
    @Override
    public double calculateEMI(double P, double annualRate, int N) {
        double R = annualRate / (12 * 100);
        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}