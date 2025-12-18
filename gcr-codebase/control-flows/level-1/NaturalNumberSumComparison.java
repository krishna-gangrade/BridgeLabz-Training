//Create a class NaturalNumberSumComparison to compare Sum of natural number using formula and adding each number
import java.util.*;

public class NaturalNumberSumComparison{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//if to check the number is natural or not
		if(number>0){
		
			int copy= number;
			int sum=0;
			
			while(number>0){
				sum=sum+number;
				number--;
			}
		
			int result = copy*(copy+1)/2;
			
			//Compare result and sum
			if(sum==result){
                System.out.println("Both computations are correct.");
            }else{
                System.out.println("The computations are not equal.");
            }
			
		}else{
            System.out.println("The number is not a natural number.");
		}
    }
}