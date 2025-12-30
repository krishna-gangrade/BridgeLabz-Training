/*

Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.

*/

//Create a class PhoneRechargeSimulator to recharge a mobile of different operating service
import java.util.Scanner;

public class PhoneRechargeSimulator {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double balance = 0;
        char choice;

        do {
            // Select operator
            System.out.println("\nSelect Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. Vi");
            System.out.print("Enter your choice (1-3): ");
            int operator = input.nextInt();

            // Enter recharge amount
            System.out.print("Enter recharge amount: ");
            double amount = input.nextDouble();

            // Update balance
            balance += amount;

            // Display offers using switch
            System.out.println("Offer Details:");
            switch (operator) {
                case 1:
                    System.out.println("Jio Offer: 1.5GB/day + Unlimited Calls");
                    break;
                case 2:
                    System.out.println("Airtel Offer: 2GB/day + Unlimited Calls");
                    break;
                case 3:
                    System.out.println("Vi Offer: 1GB/day + Weekend Data Rollover");
                    break;
                default:
                    System.out.println("Invalid operator selection");
            }

            // Show current balance
            System.out.println("Current Balance: ₹" + balance);

            // Repeat recharge
            System.out.print("\nDo you want to recharge again? (y/n): ");
            choice = input.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Phone Recharge Simulator!");
		
        input.close();
		
	}
}
