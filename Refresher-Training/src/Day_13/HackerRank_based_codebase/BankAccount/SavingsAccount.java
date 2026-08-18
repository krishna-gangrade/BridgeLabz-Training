package Day_13.HackerRank_based_codebase.BankAccount;


class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsAccount() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}