//Create a class DoubleOpt and calculate the given operations
import java.util.*;

public class DoubleOpt{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Variables are created to store input
		double a= kb.nextDouble();
		double b= kb.nextDouble();
		double c= kb.nextDouble();
		
		//Calculates the result of the given operations
		int result1= a + b *c;
		int result2= a * b + c;
		int result3= c + a / b;
		int result4= a % b + c;
		
		//Displays the result
		System.out.println("result1= "+result1+" result2= "+result2+" result3= "+result3+" result4= "+result4);
	}
}
		
