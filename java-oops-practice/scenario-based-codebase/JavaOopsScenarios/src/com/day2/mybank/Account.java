package com.day2.mybank;

abstract class Account implements ITransaction {

    // Customer & Bank identity
    protected String customerName;
    protected String bankName;

    // Sensitive
    private final String accountNumber;
    private double balance;

    protected Account(String customerName, String bankName,
                      String accountNumber, double openingBalance) {

        this.customerName = customerName;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Encapsulation
    protected double getBalanceInternal() {
        return balance;
    }

    protected void updateBalance(double newBalance) {
        this.balance = newBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("\n[DEPOSIT FAILED] Invalid amount");
            return;
        }

        balance += amount;

        System.out.println("\n[DEPOSIT SUCCESS]");
        System.out.println("Amount Deposited : ₹" + amount);
        System.out.println("Updated Balance  : ₹" + balance);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // DO NOT expose account number
    protected String maskedAccountNumber() {
        return "XXXX" + accountNumber.substring(accountNumber.length() - 4);
    }

    // Polymorphic behavior
    public abstract double calculateInterest();
    public abstract String getAccountType();
    public abstract boolean canWithdraw(double amount);

    // Structured display (REAL LIFE)
    public void showAccountSummary() {
        System.out.println("=================================");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Bank Name     : " + bankName);
        System.out.println("Account Type  : " + getAccountType());
        System.out.println("Account No    : " + maskedAccountNumber());
        System.out.println("Balance       : ₹" + balance);
        System.out.println("=================================");
    }
}