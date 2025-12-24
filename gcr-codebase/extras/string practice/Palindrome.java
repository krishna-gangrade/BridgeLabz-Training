import java.util.Scanner;
public class Palindrome {
    
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
		String result = isPalindromeLoop(text);
		System.out.println(result);
		}
		
		
        public static boolean isPalindromeLoop(String text){
        int start = 0; 
        int end = text.length() - 1;

        while(start < end){
            if(text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        
        return true;
}
