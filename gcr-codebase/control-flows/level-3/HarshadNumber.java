//Create a class HarshadNumber to check the number is harshad number or not
import java.util.*;

public class HarshadNumber{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		int sum=0;
		
		//Copy of number
		int originalNumber= number;
		
		//while loop is used to get the sum of digits
		while(number>0){
			
			int digit= number%10;
			sum= sum+ digit;
			number= number/10;
		}
		
		//Checks the originalNumbernumber is divisible by its sum and Displays the result
		if(originalNumber%sum==0){
			System.out.println("Harshad Number : "+originalNumber);
		}
		else{
			System.out.println("Not a Harshad Number : "+originalNumber);
		}
	}
}
		