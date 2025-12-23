//Create a class NumberFormatExceptionDemo to to handle exception
import java.util.Scanner;

public class NumberFormatExceptionDemo{

    //Method to generate NumberFormatException(no proper handling)
    public static void generateException(String text){
        //Trying to convert non-numeric text to integer
        int number=Integer.parseInt(text);
        System.out.println("Number is: "+number);
    }

    //Method to handle NumberFormatException using try-catch
    public static void handleException(String text){
        try{
            int number=Integer.parseInt(text);
            System.out.println("Number is: "+number);
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException caught");
            System.out.println("Reason: "+e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Generic RuntimeException caught");
            System.out.println("Reason: "+e.getMessage());
        }
    }
	
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Taking input as String
        System.out.print("Enter a value: ");
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
