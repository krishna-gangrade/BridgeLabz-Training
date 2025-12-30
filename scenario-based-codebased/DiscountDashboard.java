/*

8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.

*/

//Create a class DiscountDashboard to calculate the total amount of shopping, discount and final amount to be paid

import java.util.Scanner;

public class DiscountDashboard{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		//input for number of items
		System.out.print("Enter the number of items : ");
		int item= input.nextInt();
		
		int total=0;
		
		//loop to add the price of item
		for(int i=0;i<item;i++){
			System.out.print("Enter the price of item "+(i+1)+" : ");
			int priceOfItem= input.nextInt();
			
			total += priceOfItem;
		}
		
		double discount;
		
		//Condition to calculate discount
		if(total>=1000){
			discount=(total*0.2);
		}
		else if(total>=500){
			discount = (total * 0.1);
		}
		else{
			discount=0;
		}
		
		//Calculate final amount to be paid
		double finalAmount = total - discount;
		
		//Displays the result
		System.out.println("Total Amount :\t"+total);
		System.out.println("Discount :\t"+discount);
		System.out.println("Final Amount :\t"+finalAmount);
		
	}
}