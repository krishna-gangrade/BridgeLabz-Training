//Create a class NaturalNumberSum and find the sum of n Natural numbers
import java.util.*;

public class NaturalNumberSum{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
        int n = kb.nextInt();
		
		//Check the condition and prints the result
        if(n>0) {
            int sum = n*(n+1)/2;
            System.out.println("The sum of "+n+" natural numbers is "+sum);
        } else{
            System.out.println("The number "+n+" is not a natural number");
        }
    }
}
