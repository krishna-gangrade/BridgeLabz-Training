package com.objectmodelling.bank;

public class Main {

    public static void main(String[] args) {

        // Bank object
        Bank sbi = new Bank("State Bank of India");

        // Customer objects
        Customer customer1 = new Customer("Krishna");
        Customer customer2 = new Customer("Deepraj");

        // Association through account opening
        sbi.openAccount(customer1, 50000);
        sbi.openAccount(customer2, 10000);

        // Customers communicating with Bank
        customer1.viewBalance();
        customer2.viewBalance();
    }
}