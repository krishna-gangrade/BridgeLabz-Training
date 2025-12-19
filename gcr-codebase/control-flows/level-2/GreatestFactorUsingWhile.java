//Create a class GreatestFactorUsingWhile to find the greatest factor of the given number
import java.util.*;

public class GreatestFactorUsingWhile{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);

		int number= kb.nextInt();
		
		int greatestFactor=1;
		
		int counter=number-1;
		
		//while loop to iterate in reverse
		while(counter>=1){
		
			//if condition is checking divisibility
			if(number%counter==0){
				greatestFactor= counter;
				break;
			}
			counter--;
		}
		
		//Displays the resuly
		System.out.println(greatestFactor);
	}
}