//Create a class NullPointerExceptionDemo to throw null pointer exception

public class NullPointerExceptionDemo{

    //Method to generate NullPointerException
    public static void generateException(){

        String text=null;

        //This line will generate NullPointerException
        System.out.println(text.length());
    }

    //Method to handle NullPointerException
    public static void handleException(){

        String text=null;

        try{
            System.out.println(text.length());
        }catch(NullPointerException e) {
            System.out.println("NullPointerException handled successfully");
        }
    }

    public static void main(String args[]){

        //Call method to generate exception
        generateException();   // Uncomment to see exception

        // Refactored code to handle exception
        handleException();
    }
}
