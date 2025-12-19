//Create a class PowerCalculatorUsingWhile to calculate the power of the number 
import java.util.*;

public class PowerCalculatorUsingWhile{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
		int number = kb.nextInt();
		int power = kb.nextInt();
		
		int result=1;
		int counter= 0;
		
		//while loop multiplies the number by itself power-times
		while(counter < power){
			result=result*number;
			counter++;
		}
		
		//Displays the result
		System.out.println(result);
	}
}