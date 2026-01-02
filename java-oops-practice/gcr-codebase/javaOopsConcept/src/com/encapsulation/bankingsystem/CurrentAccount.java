
package com.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan Requested : ₹" + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 3;
    }
}
