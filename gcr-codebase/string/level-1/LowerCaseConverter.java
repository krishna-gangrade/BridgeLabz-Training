//Create a class LowerCaseConverter to convert the text into lowercase
import java.util.Scanner;

public class LowerCaseConverter{

    //Method to convert string to lowercase using charAt() and ASCII logic
    public static String convertToLowerCase(String text){
        String result="";

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);

            //Check if character is uppercase
            if(ch>='A' && ch<='Z'){
                //Convert to lowercase using ASCII difference (32)
                ch=(char)(ch+32);
            }

            result=result+ch;
        }

        return result;
    }

    //Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Taking complete text input
        System.out.print("Enter complete text: ");
        String text=input.nextLine();

        //User-defined lowercase conversion
        String manualLower=convertToLowerCase(text);

        //Built-in lowercase conversion
        String builtInLower=text.toLowerCase();

        //Comparing both results
        boolean result=compareStrings(manualLower, builtInLower);

        //Displays the result
        System.out.println("\nLowercase using charAt(): "+manualLower);
        System.out.println("Lowercase using toLowerCase(): "+builtInLower);
        System.out.println("Are both results same? "+result);

    }
}
