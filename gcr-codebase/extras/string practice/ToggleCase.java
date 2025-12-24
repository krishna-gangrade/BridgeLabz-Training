import java.util.Scanner;
public class ToggleCase {

    //toggle each character using ASCII value checks
    public static String toggleCase(String text){
        String result = "";

        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                result = result + (char)(ch + 32);
            else if(ch >= 'a' && ch <= 'z')
                result = result + (char)(ch - 32);
            else
                result = result + ch;
        }
        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(toggleCase(text));
    }
}
