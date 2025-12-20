//Create a class ArraySum to add the elements of array and print total
import java.util.*;

public class ArraySum{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		double [] array = new double[10];
		double total= 0.0;
		int index=0;
		
		//infinite loop
		while(true){
			
			//Check if the array is full
			if(index==10){
				break;
			}
			
			double value= input.nextDouble();
			
			//if the value is zero or negative it will end the loop
			if(value<=0){
				break;
			}				
			
			//inserting values in array
			array[index]= value;
			index++;
		}
	
		//for used to add up the array elements
		for(int i=0;i<index;i++){
			total=total+ array[i];
		}
		
		//Displays the result
		System.out.println("Total :"+total);
	}
}