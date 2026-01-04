package com.day2.mybank;

class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 2.0;
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(String customerName, String bankName,
                          String accountNumber, double openingBalance) {

        super(customerName, bankName, accountNumber, openingBalance);
    }

    @Override
    public boolean canWithdraw(double amount) {
        return getBalanceInternal() - amount >= -OVERDRAFT_LIMIT;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("\n[WITHDRAWAL FAILED] Invalid amount");
            return;
        }

        if (getBalanceInternal() - amount < -OVERDRAFT_LIMIT) {

            System.out.println("\n[WITHDRAWAL FAILED]");
            System.out.println("Reason           : Overdraft limit exceeded");
            System.out.println("Overdraft Limit  : ₹" + OVERDRAFT_LIMIT);
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
        return "Current Account";
    }
}