//Create a class PowerCalculator to calculate the power of the number 
import java.util.*;

public class PowerCalculator{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
		int number = kb.nextInt();
		int power = kb.nextInt();
		
		int result=1;
		
		//for loop multiplies the number by itself power-times
		for(int i=1;i<=power;i++){
			result= number*result;
		}
		
		//Displays the result
		System.out.println(result);
	}
}
	
	