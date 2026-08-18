package Day_13.HackerRank_based_codebase.AccessModifier;

public class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }
    void displayBalance() {
//        System.out.println(balance);
        System.out.println("Balance: " + getBalance());
    }
}
