package com.constructors.level1;

//Superclass
public class BankAccount {

 // Access modifiers
 public int accountNumber;        // public
 protected String accountHolder;  // protected
 private double balance;          // private

 // Constructor
 public BankAccount(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Public method to access balance
 public double getBalance() {
     return balance;
 }

 // Public method to modify balance
 public void setBalance(double balance) {
     this.balance = balance;
 }
}