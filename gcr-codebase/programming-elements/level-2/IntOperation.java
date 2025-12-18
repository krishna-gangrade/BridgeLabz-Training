//Create a class IntOperation and calculate the given operations
import java.util.*;

public class IntOperation{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Variables are created to store input
		int a= kb.nextInt();
		int b= kb.nextInt();
		int c= kb.nextInt();
		
		//Calculates the result of the given operations
		int result1= a + b *c;
		int result2= a * b + c;
		int result3= c + a / b;
		int result4= a % b + c;
		
		//Displays the result
		System.out.println("result1= "+result1+" result2= "+result2+" result3= "+result3+" result4= "+result4);
	}
}
		
