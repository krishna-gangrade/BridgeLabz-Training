package com.day5.loanbuddy;

class Applicant {

    private String name;
    private int creditScore;     // encapsulated
    private double income;
    private double loanAmount;

    public Applicant(String name, int creditScore, double income, double loanAmount) {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    int getCreditScore() {   // package-private (internal use only)
        return creditScore;
    }

    double getIncome() {
        return income;
    }

    double getLoanAmount() {
        return loanAmount;
    }
}