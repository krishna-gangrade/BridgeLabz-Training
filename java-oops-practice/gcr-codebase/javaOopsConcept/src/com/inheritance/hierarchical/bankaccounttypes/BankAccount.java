package com.inheritance.hierarchical.bankaccounttypes;

class BankAccount {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }

    void displayAccountType() {
        System.out.println("Account Type   : General Bank Account");
    }
}