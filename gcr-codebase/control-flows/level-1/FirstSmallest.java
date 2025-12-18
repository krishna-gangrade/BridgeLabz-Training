//Create a class FirstSmallest to check if the number1 is smallest
import java.util.*;

public class FirstSmallest{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Creating variable and assign users input 
		int number1= kb.nextInt();
		int number2= kb.nextInt();
		int number3= kb.nextInt();
		
		boolean flag= false;
		
		//Using if with conditions to check if the number1 is smallest
		if(number1<number2 && number1<number3){
			flag= true;
		}
		
		//Displays the result
		System.out.println("Is the first number the smallest? "+flag);
	}
}