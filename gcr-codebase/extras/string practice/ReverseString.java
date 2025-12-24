import java.util.Scanner;
public class ReverseString {
    
	
	//to use charAt() to print it 
    public static String reverse(String text){
        String result = "";
        for(int i=text.length()-1;i>=0;i--){
            result = result + text.charAt(i);
        }
        			return result;

    }

    public static void main(String[] args){

        //to print the reverse string
		Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(reverse(text));
    }
}
