//Create a class StringLengthFinder to find the length of the string without length method
import java.util.*;

public class StringLengthFinder{

    //User-defined method to find length without using length()
    public static int findLengthWithoutLengthMethod(String str){
        int count=0;

        //Infinite loop
        while(true){
            try{
                str.charAt(count); 
                count++;
            }catch(StringIndexOutOfBoundsException e){
                break;
            }
        }
        return count;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Taking user input
        String text=input.next();

        //Calling user-defined method
        int customLength=findLengthWithoutLengthMethod(text);

        //Calling built-in length() method
        int builtInLength=text.length();

        //Displays the result
        System.out.println("Length using user-defined method: "+customLength);
        System.out.println("Length using built-in length() method: "+builtInLength);
    }
}
