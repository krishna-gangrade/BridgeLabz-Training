package com.constructors.level1;

//Subclass
class SavingsAccount extends BankAccount {

// Constructor
public SavingsAccount(int accountNumber, String accountHolder, double balance) {
   super(accountNumber, accountHolder, balance);
}

// Method demonstrating access to public & protected members
public void displayDetails() {
   System.out.println("Account Number : " + accountNumber);   // public
   System.out.println("Account Holder : " + accountHolder);   // protected
   System.out.println("Balance        : " + getBalance());    // private via getter
}

public static void main(String[] args) {

   SavingsAccount account =
           new SavingsAccount(123456, "Rahul", 50000.0);

   // Accessing balance
   account.displayDetails();

   // Modifying balance using public method
   account.setBalance(55000.0);

   System.out.println("\nAfter Balance Update:");
   account.displayDetails();
}
}