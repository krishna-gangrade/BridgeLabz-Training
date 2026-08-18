package Day_13.HackerRank_based_codebase.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Krishna");
        BankAccount account3 = new BankAccount("Pratham", 5000);

        System.out.println("Account 1: ");
        account1.displayAccount();
        System.out.println();

        System.out.println("Account 2: ");
        account2.displayAccount();
        System.out.println();

        System.out.println("Account 3: ");
        account3.displayAccount();
        System.out.println();

        System.out.println("Savings Account: ");
        SavingsAccount savings = new SavingsAccount("Deepanshu", 10000, 7.5);
        savings.displaySavingsAccount();
    }
}