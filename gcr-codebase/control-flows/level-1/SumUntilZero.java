//Create a class SumUntilZero to add numbers until zero
import java.util.*;

public class SumUntilZero{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
		double total=0.0;
		
		double number=kb.nextDouble();
		
		//Using while for sum of the numbers
		while(number!=0){
			total= total+number;
			number= kb.nextDouble();
		}
		
		//Displays the result
		System.out.println(total);
	}
}