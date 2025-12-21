//Create a class DigitFrequencyCounter to count the frequency of the numbers
import java.util.*;

public class DigitFrequencyCounter{

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Take input number
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        int temp=number;
        int count=0;

        //Count number of digits
        while(temp!=0){
            count++;
            temp=temp/10;
        }

        int[] digits=new int[count];

        //Store digits in array
        temp=number;
        for(int i=0;i<count;i++){
            digits[i]=temp%10;
            temp=temp/10;
        }

        //Frequency array for digits 0-9
        int[] frequency=new int[10];

        //Find frequency of each digit
        for(int i=0;i<count;i++){
            frequency[digits[i]]++;
        }

        //Displays the result
        System.out.println("\nDigit Frequency:");
        for (int i=0;i<10;i++){
            if(frequency[i]>0){
                System.out.println("Digit "+i+" : "+frequency[i]);
            }
        }
    }
}
