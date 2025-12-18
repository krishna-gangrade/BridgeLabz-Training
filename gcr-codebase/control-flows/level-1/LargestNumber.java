//Create a class LargestNumber and find the largest number
import java.util.*;

public class LargestNumber{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Create variables and assign user's input
		int number1= kb.nextInt();
		int number2= kb.nextInt();
		int number3= kb.nextInt();
		
		//Check the condition and display output for number1
		if(number1>number2 && number1>number3){
			System.out.println("Is the first number the largest? True");
		}else{
			System.out.println("Is the first number the largest? False");
		}
		
		//Check the condition and display output for number2
		if(number2>number1 && number2>number3){
			System.out.println("Is the first number the largest? True");
		}else{
			System.out.println("Is the first number the largest? False");
		}
		
		//Check the condition and display output for number3
		if(number3>number1 && number3>number2){
			System.out.println("Is the first number the largest? True");
		}else{
			System.out.println("Is the first number the largest? False");
		}
	}
}