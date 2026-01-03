/*
 
4. E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic

*/

package com.day1.ewalletapplication;

class Main {

    public static void main(String[] args) {

        User krishna = new User("Krishna91", "Krishna", new PersonalWallet(1000));

        User jay = new User("Jay82", "Jay", new BusinessWallet(5000)
        );

        // User actions
        krishna.loadMoney(2000);
        krishna.transferTo(jay, 1200);

        System.out.println("\n===== WALLET SUMMARY =====\n");

        // Alice summary (balance first, then history)
        System.out.println("User : Krishna (Krishna91)");
        System.out.println("Balance : ₹" + krishna.checkBalance());
        krishna.showTransactions();

        System.out.println();

        // Shop summary
        System.out.println("User : Jay (Jay82)");
        System.out.println("Balance : ₹" + jay.checkBalance());
        jay.showTransactions();
    }
}