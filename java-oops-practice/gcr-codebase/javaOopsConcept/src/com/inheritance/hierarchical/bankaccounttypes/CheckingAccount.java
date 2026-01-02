package com.inheritance.hierarchical.bankaccounttypes;

class CheckingAccount extends BankAccount {

    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type   : Checking Account");
        System.out.println("Withdrawal Cap : ₹" + withdrawalLimit);
    }
}