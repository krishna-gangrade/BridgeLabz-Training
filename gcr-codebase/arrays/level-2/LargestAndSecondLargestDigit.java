//Create a class LargestAndSecondLargestDigit to find the largest and second largest digit from array
import java.util.*;

public class LargestAndSecondLargestDigit{

    public static void main(String args[]){

        Scanner input= new Scanner(System.in);

        //Take input number
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        int maxDigit= 10;
        int[] digits= new int[maxDigit];

        int index= 0;

        //Store the digits in array
        while(number!=0){
            if(index==maxDigit){
                break;
            }
            digits[index]=number%10;
            number=number/10;
            index++;
        }

        int largest= 0;
        int secondLargest= 0;

        //Find largest and second largest
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest= digits[i];
            }
            else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest=digits[i];
            }
        }

        // Displays the result
        System.out.println("Largest Digit : "+largest);
        System.out.println("Second Largest Digit : "+secondLargest);
		
    }
}
