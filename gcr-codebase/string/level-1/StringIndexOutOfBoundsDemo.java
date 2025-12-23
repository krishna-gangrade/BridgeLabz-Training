//Create a class StringIndexOutOfBoundsDemo to handle the exception
import java.util.*;

public class StringIndexOutOfBoundsDemo{

    //Method that generates the exception(no try-catch)
    public static void generateException(String text){
        //Accessing index beyond string length
        System.out.println("Character at invalid index: "+text.charAt(text.length()));
    }

    //Method that handles the exception using try-catch
    public static void handleException(String text){
        try{
            //Accessing index beyond string length
            System.out.println("Character at invalid index: "+text.charAt(text.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception caught: StringIndexOutOfBoundsException");
            System.out.println("Reason: " + e.getMessage());
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a String: ");
        String text=input.nextLine();

        //Calling method that generates exception
        System.out.println("\nCalling method to generate exception:");
        try{
            generateException(text);
        }catch(Exception e){
            System.out.println("Program stopped due to runtime exception.");
        }

        //Calling method that handles exception
        System.out.println("\nCalling method to handle exception:");
        handleException(text);
		
    }
}
