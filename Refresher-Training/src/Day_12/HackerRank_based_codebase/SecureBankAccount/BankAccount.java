package Day_12.HackerRank_based_codebase.SecureBankAccount;

public class BankAccount {
        private double balance;
        protected String accountType;
        String branchCode;

        public BankAccount(double balance, String accountType, String branchCode){
                if(balance<0){
                        System.out.println("Invalid balance. Setting balance to 0.");
                        this.balance =0;
                }else {
                        this.balance= balance;
                }
                this.accountType= accountType;
                this.branchCode= branchCode;
        }

        public void deposit(double amount){
                if(amount<0) {
                        System.out.println("Deposit amount cannot be negative.");
                        return;
                }
                balance= balance+amount;
        }

        public void withdraw(double amount){
                if(amount< 0){
                        System.out.println("Withdrawal amount cannot be negative.");
                        return;
                }
                if(amount> balance){
                        System.out.println("Insufficient balance. Withdrawal rejected.");
                        return;
                }
                balance = balance- amount;
        }

        public double getBalance(){
                return balance;
        }

        public static void main(String[] args) {
                BankAccount account= new BankAccount(1000, "Savings", "BR001");

                System.out.println("Initial balance :"+ account.getBalance());
                account.deposit(500);
                System.out.println("After deposit :"+account.getBalance());
                account.withdraw(5000);
                System.out.println("Final balance : "+account.getBalance());

                BankAccount account2= new BankAccount(-1000, "Current", "BR002");
                System.out.println("Account 2 balance : "+ account2.getBalance());

        }
}
