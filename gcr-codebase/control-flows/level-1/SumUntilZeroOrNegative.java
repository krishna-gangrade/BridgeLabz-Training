//Create a class SumUntilZeroOrNegative to add numbers until zero
import java.util.*;

public class SumUntilZeroOrNegative{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
		double total=0.0;
		
		
		//Using while for sum of the numbers
		while(true){
			double number=kb.nextDouble();
			
			if(number<=0){
				break;
			}
			total= total+number;
		}
		
		//Displays the result
		System.out.println(total);
	}
}