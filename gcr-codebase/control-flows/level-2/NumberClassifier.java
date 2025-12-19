//Create a class NumberClassifier and print even or odd numbers
import java.util.*;

public  class NumberClassifier{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//if condition to check natural number
		if(number>0){
		
			//for loop to iterate
			for(int i =1; i<=number;i++){
				if(i%2==0){
					System.out.println(i+ " is  an even number");
				}
				else{
					System.out.println(i+ " is an odd number");
				}
			}
		}
	}
}