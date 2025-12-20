//Create a class CheckNumber to check whether the number is positive, negative or zero and check the number is odd or even
import java.util.*;

public class CheckNumber{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int [] array= new int[5];
		
		//for loop to insert element in array
		for(int i= 0;i<array.length;i++){
			array[i]= input.nextInt();	
		}
		
		//for loop to traverse all element 
		for(int i=0;i<array.length;i++){
			
			//if to check the number is positive
			if(array[i]>0){
			
				//if to check the number is even or odd
				if(array[i]%2==0){
					System.out.println("Even Number :"+array[i]);
				}
				else{
					System.out.println("Odd Number :"+array[i]);
				}
			}
			//to check the number is negative
			else if(array[i]<0){
				System.out.println("Negative :"+array[i]);
			}
			//to check the number is zero
			else{
				System.out.println("Zero :"+array[i]);
			}
		}
		
		//if to check the first and last number is equal or not equal
		if(array[0]==array[4]){
			System.out.println("First and Last element are equal");
		}
		else{
			System.out.println("First and Last element are not equal");
		}
	}
}
		
		