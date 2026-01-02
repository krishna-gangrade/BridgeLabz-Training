package com.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Requested : ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}