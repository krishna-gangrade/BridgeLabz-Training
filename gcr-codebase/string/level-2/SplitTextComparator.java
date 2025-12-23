//Create a class SplitTextComparator to split the text, count the words 
import java.util.*;

public class SplitTextComparator{

    //Method to find length of String without using length()
    public static int findLength(String text){
        int count=0;
        while(true){
            try{
                text.charAt(count);
                count++;
            }catch(StringIndexOutOfBoundsException e){
                break;
            }
        }
        return count;
    }

    //Method to split text into words without using split()
    public static String[] customSplit(String text){

        int length=findLength(text);

        //Count words
        int wordCount=1;
        for(int i=0;i<length;i++){
            if (text.charAt(i)==' '){
                wordCount++;
            }
        }

        //Store space indexes
        int[] spaceIndex=new int[wordCount+1];
        int index=1;

        spaceIndex[0]=-1;
        spaceIndex[wordCount]=length; 

        for(int i=0;i<length;i++){
            if(text.charAt(i)==' '){
                spaceIndex[index++]=i;
            }
        }

        //Extract words
        String[] words=new String[wordCount];

        for(int i=0;i<wordCount;i++){
            String word="";
            for(int j=spaceIndex[i]+1;j<spaceIndex[i+1];j++){
                word=word+text.charAt(j);
            }
            words[i]=word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2){

        if(arr1.length!=arr2.length){
            return false;
        }
		
        for(int i=0;i<arr1.length;i++){
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //User input
        String text=input.nextLine();

        //Custom split
        String[] customWords=customSplit(text);

        //Built-in split
        String[]builtInWords=text.split(" ");

        // Compare results
        boolean result=compareStringArrays(customWords, builtInWords);

        //Displays the result
        System.out.println("Custom Split Words: "+Arrays.toString(customWords));
        System.out.println("Built-in Split Words: "+Arrays.toString(builtInWords));
        System.out.println("Are both results same? "+result);
    }
}
