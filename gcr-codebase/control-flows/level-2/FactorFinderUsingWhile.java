//Create a class FactorFinder to find the factors of the number
import java.util.*;

public class FactorFinderUsingWhile{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//if condition to check the number is positive
		if(number>0){
			
			//Created counter variable
			int counter=1;
			
			//while loop to iterate 
			while(counter<number){
				
				//if to check the divisibility and print the result
				if(number%counter==0){
					System.out.println(counter);
				}
				counter++;
			}
		}
	}
}