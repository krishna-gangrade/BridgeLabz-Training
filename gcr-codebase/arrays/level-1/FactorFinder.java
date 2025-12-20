//Create a class FactorFinder and find the factor of the number
import java.util.*;

public class FactorFinder{
    public static void main(String args[]){

        Scanner input= new Scanner(System.in);
		
        int number = input.nextInt();
		
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index= 0;
		
        for(int i=1;i<=number;i++){
			
			//if condition to check divisibility
            if(number%i== 0){
				
				//to check if the array is filled and to extend the size
                if(index== maxFactor){
                    maxFactor= maxFactor*2;
                    int[] temp= new int[maxFactor];

                    for(int j=0;j<factors.length;j++){
                        temp[j]=factors[j];
                    }

                    factors= temp;
                }
                factors[index]= i;
                index++;
            }
        }
        System.out.println("Factors of "+number+" are:");
        for(int i=0;i<index;i++){
            System.out.print(factors[i]+" ");
        }
    }
}
