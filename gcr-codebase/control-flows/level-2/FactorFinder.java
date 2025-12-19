//Create a class FactorFinder to find the factors of the number
import java.util.*;

public class FactorFinder{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//if condition to check the number is positive
		if(number>0){
			
			//for loop to iterate 
			for(int i=1;i<number;i++){
				
				//if to check the divisibility and print the result
				if(number%i==0){
					System.out.println(i);
				}
			}
		}
	}
}