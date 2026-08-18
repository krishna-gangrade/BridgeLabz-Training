package Day_13.HackerRank_based_codebase.AccessModifier;

public class Account {
    private double balance;

    Account(double balance){
        this.balance =balance;
    }
    protected double getBalance(){
        return balance;
    }
}
