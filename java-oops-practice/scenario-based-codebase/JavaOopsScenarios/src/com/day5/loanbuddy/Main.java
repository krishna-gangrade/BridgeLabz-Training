package com.day5.loanbuddy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to LoanBuddy (FinlyTech) =====");

        // Applicant details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter loan amount required: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(
                name, creditScore, income, loanAmount
        );

        // Loan type selection
        System.out.println("\nSelect Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.println("3. Personal Loan");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        LoanApplication loan = null;

        // Eligibility check first (without tenure)
        switch (choice) {

            case 1 -> loan = new HomeLoan(0);
            case 2 -> loan = new AutoLoan(0);
            case 3 -> loan = new PersonalLoan(0);
            default -> {
                System.out.println("Invalid loan type selected.");
                sc.close();
                return;
            }
        }

        // Check eligibility
        if (!loan.approveLoan(applicant)) {
            System.out.println("\n Loan Rejected.");
            System.out.println("Reason: Eligibility criteria not met.");
            sc.close();
            return;
        }

        System.out.println("\n You are eligible for this loan.");

        // Ask tenure only if eligible
        System.out.print("Enter loan tenure (in months): ");
        int tenure = sc.nextInt();

        // Re-create loan with tenure
        if (choice == 1) loan = new HomeLoan(tenure);
        else if (choice == 2) loan = new AutoLoan(tenure);
        else loan = new PersonalLoan(tenure);

        loan.approveLoan(applicant);

        // EMI Calculation
        double emi = loan.calculateEMI(
                applicant.getLoanAmount(),
                loan.interestRate,
                tenure
        );

        // Final Output
        System.out.println("\n===== Loan Approval Summary =====");
        System.out.println("Applicant Name : " + applicant.getName());
        System.out.println("Loan Type      : " +
                (choice == 1 ? "Home Loan" :
                 choice == 2 ? "Auto Loan" : "Personal Loan"));
        System.out.println("Loan Amount    : Rs. " + applicant.getLoanAmount());
        System.out.println("Tenure         : " + tenure + " months");
        System.out.println("Interest Rate  : " + loan.interestRate + "%");
        System.out.println("Monthly EMI    : Rs. " + String.format("%.2f", emi));
        System.out.println("Loan Status    : APPROVED ");

        sc.close();
    }
}