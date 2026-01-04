package com.day2.mybank;

class Main {

	public static void main(String[] args) {

		Account savings = new SavingsAccount("Prashant Kumar Sharma", "State Bank of India", "SB123456789", 5000);

		Account current = new CurrentAccount("Prashant Kumar Sharma", "IndusInd Bank", "CA987654321", 3000);

		System.out.println("-----------Savings Account Status-----------");
		savings.showAccountSummary();
		savings.deposit(2000);
		savings.withdraw(6500); // should fail
		savings.withdraw(3000); // valid
		System.out.println("Interest Earned: ₹" + savings.calculateInterest()+"\n");
		System.out.println("-----------Updated Account Status-----------");
		savings.showAccountSummary();

		System.out.println("\n");

		System.out.println("----------Current Account Status------------");
		current.showAccountSummary();
		current.withdraw(6000); // overdraft allowed
		current.withdraw(4000); // should fail
		System.out.println("Interest Earned: ₹" + current.calculateInterest()+"\n");
		System.out.println("----------Updated Account Status-----------");
		current.showAccountSummary();
	}
}