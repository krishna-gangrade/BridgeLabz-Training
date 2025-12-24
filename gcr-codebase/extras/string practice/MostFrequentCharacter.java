import java.util.Scanner;
public class MostFrequentCharacter {

    //find character with maximum frequency
    public static char mostFrequent(String text){
        int[] freq = new int[256];

        for(int i=0;i<text.length();i++)
            freq[text.charAt(i)]++;

        char result = text.charAt(0);
        int max = freq[result];

        for(int i=1;i<text.length();i++){
            if(freq[text.charAt(i)] > max){
                max = freq[text.charAt(i)];
                result = text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Most Frequent Character: '" + mostFrequent(text) + "'");
    }
}
