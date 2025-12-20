//Create a class OddEvenArray to find odd and even number using array
import java.util.*;

public class OddEvenArray{
	public static void main(String args[]){
	
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		//Check for the natural number
		if(number>0){
			
			int size= (number/2)+1;
			int [] even= new int[size];
			int [] odd= new int[size];
			
			int evenIndex=0, oddIndex=0;
			
			//for loop to separate odd and even numbers in different arrays
			for(int i=1; i<=number;i++){
				
				if(i%2==0){
					even[evenIndex]=i;
					evenIndex++;
				}else{
					odd[oddIndex]=i;
					oddIndex++;
				}
			}
			
			//Displays the required result
			System.out.print("Even Numbers : ");
			for(int i=0;i<evenIndex;i++){
				System.out.print(even[i]+" ");
			}
			System.out.println();
			System.out.print("Odd Numbers : ");
			for(int i=0;i<oddIndex;i++){
				System.out.println(odd[i]+" ");
			}
			
		}
		else{
			System.out.println("Try again");
			return;
		}
	}
}//Create a class OddEvenArray to find odd and even number using array
import java.util.*;

public class OddEvenArray{
	public static void main(String args[]){
	
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		//Check for the natural number
		if(number>0){
			
			int size= (number/2)+1;
			int [] even= new int[size];
			int [] odd= new int[size];
			
			int evenIndex=0, oddIndex=0;
			
			//for loop to separate odd and even numbers in different arrays
			for(int i=1; i<=number;i++){
				
				if(i%2==0){
					even[evenIndex]=i;
					evenIndex++;
				}else{
					odd[oddIndex]=i;
					oddIndex++;
				}
			}
			
			//Displays the required result
			System.out.print("Even Numbers : ");
			for(int i=0;i<evenIndex;i++){
				System.out.print(even[i]+" ");
			}
			System.out.println();
			System.out.print("Odd Numbers : ");
			for(int i=0;i<oddIndex;i++){
				System.out.println(odd[i]+" ");
			}
			
		}
		else{
			System.out.println("Try again");
			return;
		}
	}
}