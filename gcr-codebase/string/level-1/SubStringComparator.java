//Create a class SubStringComparator to create substring using charAt as well as with substring
import java.util.*;

public class SubStringComparator{

    //method to create substring using charAt()
    public static String getSubstringUsingCharAt(String str, int start, int end) {
        String result="";

        for(int i=start;i<end;i++){
            result=result+str.charAt(i);
        }

        return result;
    }

    //method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        //First check length
        if(s1.length()!=s2.length()){
            return false;
        }

        //Compare character by character
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        Scanner input=new Scanner(System.in);

        //Taking inputs
        String text=input.next();
        int start=input.nextInt();
        int end=input.nextInt();

        //Substring using charAt()
        String manualSubstring=getSubstringUsingCharAt(text,start,end);

        //Substring using built-in method
        String builtInSubstring=text.substring(start, end);

        //Compare both substrings
        boolean result=compareStringsUsingCharAt(manualSubstring, builtInSubstring);

        //Displays the result
        System.out.println("Substring using charAt(): "+manualSubstring);
        System.out.println("Substring using substring(): "+builtInSubstring);
        System.out.println("Are both substrings equal? "+result);
    }
}
