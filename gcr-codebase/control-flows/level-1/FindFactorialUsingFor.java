//Create a class FindFactorial and print the factorial of the inputed number
import java.util.*;

public class FindFactorialUsingFor{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		int factorial=1;
		
		//if to check the number is positive
		if(number>0){
			for(int i= number;i>0;i--){
				factorial= factorial*i;
				
			}
		}
		
		//Displays the result
		System.out.println(factorial);
	}
}