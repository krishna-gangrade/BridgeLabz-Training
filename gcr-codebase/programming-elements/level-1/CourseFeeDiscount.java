import java.util.*;

public class CourseFeeDiscount{
public static void main(String args[]){

    Scanner kb = new Scanner(System.in);
	
    //Taking fee and discountPercent from the user 
	double fee = kb.nextDouble();
	double discountPercent = kb.nextDouble();
	
	double discount = (fee * discountPercent)/100;
	
	// discountedFee= actual fees - discount;
	double discountedFee= fee-discount;
	
	//Displays the result
	System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedFee);
}
}