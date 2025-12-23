//Create a class ArrayIndexOutOfBoundsExceptionDemo to handle the exception
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo{

    //Method to generate ArrayIndexOutOfBoundsException(no proper handling)
    public static void generateException(String[] names){
        //Accessing index beyond array length
        System.out.println("Name: "+names[names.length]);
    }

    //Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names){
        try{
            //Accessing index beyond array length
            System.out.println("Name: "+names[names.length]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException caught");
            System.out.println("Reason: "+e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Generic RuntimeException caught");
            System.out.println("Reason: "+e.getMessage());
        }
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Taking array size
        System.out.print("Enter number of names: ");
        int size=input.nextInt();
        input.nextLine();

        //Defining array
        String[] names=new String[size];

        //Taking user input for array
        for(int i=0;i<size;i++){
            System.out.print("Enter name "+(i+1)+": ");
            names[i]=input.nextLine();
        }

        //Calling method to generate exception
        System.out.println("\nCalling method to generate exception:");
        try{
            generateException(names);
        }catch(Exception e){
            System.out.println("Program stopped due to runtime exception.");
        }

        //Calling method to handle exception
        System.out.println("\nCalling method to handle exception:");
        handleException(names);

    }
}
