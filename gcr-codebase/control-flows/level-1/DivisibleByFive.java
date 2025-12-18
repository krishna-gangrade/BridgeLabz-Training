//Create a class DivisibleByFive to check if number is  divisible by 5 
import java.util.*;

public class DivisibleByFive{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		boolean flag= false;
		
		//Condition to check divisibility
		if(number%5==0){
			flag=true;
		}
		
		//Displays the result
		System.out.println("Is the number "+number+" divisible by 5? "+flag);
	}
}
