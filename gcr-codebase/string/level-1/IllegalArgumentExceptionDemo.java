//Create a class IllegalArgumentExceptionDemo to handle the exception

import java.util.Scanner;

public class IllegalArgumentExceptionDemo{

    //Method to generate IllegalArgumentException(no proper handling)
    public static void generateException(String text){
        //start index is greater than end index
        System.out.println(text.substring(5, 2));
    }

    //Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text){
        try{
            //start index is greater than end index
            System.out.println(text.substring(5, 2));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
            System.out.println("Reason: "+e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Generic RuntimeException caught");
            System.out.println("Reason: "+e.getMessage());
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
		
        //Taking user input
        System.out.print("Enter a String: ");
        String text=input.nextLine();

        //Calling method to generate exception
        System.out.println("\nCalling method to generate exception:");
        try{
            generateException(text);
        }catch(Exception e){
            System.out.println("Program stopped due to runtime exception.");
        }

        //Calling method to handle exception
        System.out.println("\nCalling method to handle exception:");
        handleException(text);
    }
}
