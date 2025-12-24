import java.util.Scanner;
public class LongestWord {

    //to find longest word usng charAt()
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String longest = "";
        String current = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' ')
                current = current + s.charAt(i);
            else{
                if(current.length() > longest.length())
                    longest = current;
                current = "";
            }
        }

        if(current.length() > longest.length())
            longest = current;

        System.out.println(longest);
    }
}
