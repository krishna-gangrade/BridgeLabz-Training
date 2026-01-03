package com.objectmodelling.bank;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    // Open account for customer (association)
    public void openAccount(Customer customer, double initialDeposit) {
        customers.add(customer);
        customer.setBank(this);
        customer.deposit(initialDeposit);
    }

    // Getter
    public String getBankName() {
        return bankName;
    }
}