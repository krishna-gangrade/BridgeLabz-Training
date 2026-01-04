package com.day2.mybank;

class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;
    private static final double MIN_BALANCE = 1000;

    public SavingsAccount(String customerName, String bankName,
                          String accountNumber, double openingBalance) {

        super(customerName, bankName, accountNumber, openingBalance);
    }

    @Override
    public boolean canWithdraw(double amount) {
        return getBalanceInternal() - amount >= MIN_BALANCE;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("\n[WITHDRAWAL FAILED] Invalid amount");
            return;
        }

        if (getBalanceInternal() - amount < MIN_BALANCE) {

            System.out.println("\n[WITHDRAWAL FAILED]");
            System.out.println("Reason           : Minimum balance violation");
            System.out.println("Minimum Required : ₹" + MIN_BALANCE);
            System.out.println("Current Balance  : ₹" + getBalanceInternal());
            return;
        }

        updateBalance(getBalanceInternal() - amount);

        System.out.println("\n[WITHDRAWAL SUCCESS]");
        System.out.println("Amount Withdrawn : ₹" + amount);
        System.out.println("Remaining Balance: ₹" + getBalanceInternal());
    }


    @Override
    public double calculateInterest() {
        return getBalanceInternal() * INTEREST_RATE / 100;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }
}