import java.util.Scanner;
public class ReplaceWord {

    //replace target word by scanning sentence word by word
    public static String replaceWord(String sentence,String oldWord,String newWord){
        String result = "";
        String word = "";

        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);

            if(ch != ' ')
                word = word + ch;
            else{
                if(word.equals(oldWord))
                    result = result + newWord + " ";
                else
                    result = result + word + " ";
                word = "";
            }
        }

        //handle last word in sentence
        if(word.equals(oldWord))
            result = result + newWord;
        else
            result = result + word;

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.next();
        String newWord = sc.next();

        System.out.println(replaceWord(sentence,oldWord,newWord));
    }
}
