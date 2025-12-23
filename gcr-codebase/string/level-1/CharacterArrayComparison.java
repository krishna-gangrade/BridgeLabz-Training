//Create a class CharacterArrayComparison to compare two char arrays
import java.util.*;

public class CharacterArrayComparison{

    //User-defined method to return characters without using toCharArray()
    public static char[] getCharacters(String str){
        char[] result=new char[str.length()];

        for (int i=0;i<str.length();i++) {
            result[i]=str.charAt(i);
        }

        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1,char[] arr2){

        if(arr1.length!=arr2.length){
            return false;
        }

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Taking user input
        String text=input.next();

        //User-defined method
        char[] userArray=getCharacters(text);

        //Built-in method
        char[] builtInArray=text.toCharArray();

        //Comparing both arrays
        boolean result=compareCharArrays(userArray, builtInArray);

        //Displays the result
        if(result){
            System.out.println("Both character arrays are equal");
        }else{
            System.out.println("Character arrays are NOT equal");
        }
    }
}
