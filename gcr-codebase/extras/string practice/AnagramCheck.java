import java.util.Scanner;
public class AnagramCheck {

    //check anagram using character frequency
    public static boolean isAnagram(String a,String b){

        if(a.length() != b.length())
            return false;

        int[] freq = new int[256];

        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        //if any frequency is not zero, not an anagram
        for(int i=0;i<256;i++){
            if(freq[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1,s2));
    }
}
