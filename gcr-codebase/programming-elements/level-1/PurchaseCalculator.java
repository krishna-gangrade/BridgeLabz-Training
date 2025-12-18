//Creating a class PurchaseCalculator to calculate the total price of the given item.

import java.util.*;

public class PurchaseCalculator{
    public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		//Create variables unitPrice and quantity to calculate totalPrice
		double unitPrice= kb.nextDouble();
		int quantity= kb.nextInt();
		
		double totalPrice= unitPrice * quantity;
		
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}