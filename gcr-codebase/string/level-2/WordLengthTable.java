//Create a class WordLengthTable to find the length of the word and to split words
import java.util.*;

public class WordLengthTable{

    //Method to calculate string length without using length()
    public static int findLength(String str){
        int count=0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }

    //Method to split text into words using charAt()
    public static String[] splitWords(String text){

        int wordCount=0;
        boolean inWord=false;

        //Count words
        for(int i=0;;i++){
            try{
                char ch=text.charAt(i);
                if(ch!=' ' && !inWord){
                    wordCount++;
                    inWord=true;
                }else if(ch==' '){
                    inWord=false;
                }
            }catch(Exception e){
                break;
            }
        }

        String[] words=new String[wordCount];
        int index=0;
        String word="";

        //Extract words
        for(int i=0; ;i++){
            try{
                char ch=text.charAt(i);
                if(ch!=' '){
                    word+=ch;
                }else if(!word.equals("")){
                    words[index++]=word;
                    word="";
                }
            }catch(Exception e){
                if(!word.equals("")){
                    words[index]=word;
                }
                break;
            }
        }
        return words;
    }

    //Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words){

        String[][] table=new String[words.length][2];

        for(int i=0;i<words.length;i++){
            table[i][0]=words[i];
            table[i][1]=String.valueOf(findLength(words[i]));
        }
        return table;
    }
	
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the text:");
        String text=input.nextLine();

        String[] words=splitWords(text);
        String[][] result=createWordLengthTable(words);

        System.out.println("\nWord\tLength");

        for(int i=0;i<result.length;i++){
            int length=Integer.parseInt(result[i][1]);
            System.out.println(result[i][0]+"\t"+length);
        }
    }
}
