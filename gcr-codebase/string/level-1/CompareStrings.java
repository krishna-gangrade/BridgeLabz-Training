// Create a class CompareStrings to check two string result
import java.util.*;

public class CompareStrings {

    // Method to compare strings using charAt()
    public static boolean compareString(String string1, String string2) {

        //if is used to check length
        if(string1.length()!=string2.length()){
            return false;
        }

        //for is used to compare character by character
        for(int i=0;i<string1.length();i++){
            if(string1.charAt(i)!=string2.charAt(i)){
                return false;
            }
        }

        //if all characters matched
        return true;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        //taking input
        String string1=input.next();
        String string2=input.next();

        //Using charAt() method
        boolean charAtResult = compareString(string1, string2);

        //Using equals() method
        boolean equalsResult = string1.equals(string2);

        //Displays the result
        System.out.println("Result using charAt() method: "+charAtResult);
        System.out.println("Result using equals() method: "+equalsResult);

        //to check if both results are same
        if(charAtResult==equalsResult){
            System.out.println("Both results are SAME");
        } else {
            System.out.println("Both results are DIFFERENT");
        }
    }
}
