package Day_13.HackerRank_based_codebase.BankAccount;

public class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(){
        this("Unknown", 0);
    }

    BankAccount(String accountHolder){
        this(accountHolder, 0);
    }

    BankAccount(String accountHolder, double balance){
        this.accountHolder =accountHolder;
        this.balance =balance;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

}
