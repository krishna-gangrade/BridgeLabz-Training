package com.inheritance.hierarchical.bankaccounttypes;

public class Main {

    public static void main(String[] args) {

        BankAccount[] accounts = {
            new SavingsAccount("SB1001", 50000, 4.5),
            new CheckingAccount("CA2001", 30000, 10000),
            new FixedDepositAccount("FD3001", 100000, 24)
        };

        for (BankAccount acc : accounts) {
            acc.displayAccountDetails();
            acc.displayAccountType();
            System.out.println("--------------------------------");
        }
    }
}