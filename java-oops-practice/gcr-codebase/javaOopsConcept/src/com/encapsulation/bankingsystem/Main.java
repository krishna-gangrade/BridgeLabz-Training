package com.encapsulation.bankingsystem;

public class Main {

    public static void main(String[] args) {

        BankAccount[] accounts = {
            new SavingsAccount("SB101", "Amit", 50000),
            new CurrentAccount("CA202", "Riya", 80000)
        };

        for (BankAccount acc : accounts) {

            acc.displayDetails();

            double interest = acc.calculateInterest();
            System.out.println("Interest Earned : ₹" + interest);

            Loanable loan = (Loanable) acc;
            loan.applyForLoan(100000);
            System.out.println("Loan Eligibility : ₹" + loan.calculateLoanEligibility());

            System.out.println("--------------------------------");
        }
    }
}