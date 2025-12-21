//Create a class ReverseNumberUsingArray to reverse a number using array
import java.util.*;

public class ReverseNumberUsingArray{

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Take input number
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        int temp=number;
        int count=0;

        //Find number of digits
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

        //Reverse array
        int[] reverse=new int[count];
        for(int i=0;i<count;i++){
            reverse[i]=digits[count-1-i];
        }

        //Displays the result
        System.out.print("Reversed Number: ");
        for(int i=0;i<count;i++){
            System.out.print(reverse[i]);
        }
    }
}
