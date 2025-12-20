//Create a class Armstrong Number and check if the number is armstrong number
import java.util.*;

public class ArmstrongNumber{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		int sum=0;
		
		//Copy of number
		int originalNumber=number;
		
		//while to apply condition for originalNumber should not equal to zero
		while(originalNumber!=0){
			
			int reminder= originalNumber%10;
			
			sum= sum + (reminder*reminder*reminder);
			
			originalNumber= originalNumber/10;
		}
		
		//if condition to check the number and sum are equal and Displays the result
		if(number==sum){
			System.out.println("The number "+number+" is Armstrong Number");
		}
		else{
			System.out.println("The number "+number+" is not the Armstrong Number");
		}
	}
}
