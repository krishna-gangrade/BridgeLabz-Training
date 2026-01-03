
package com.objectmodelling.bank;

public class Customer {

    private String customerName;
    private double balance;
    private Bank bank;   // Association with Bank

    // Constructor
    public Customer(String customerName) {
        this.customerName = customerName;
        this.balance = 0.0;
    }

    // Method to link customer with a bank
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // View balance (communication)
    public void viewBalance() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Bank Name     : " + bank.getBankName());
        System.out.println("Balance       : ₹" + balance);
        System.out.println();
    }
}
