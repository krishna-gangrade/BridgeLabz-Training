import java.util.Scanner;
public class RemoveDuplicates {

    public static String removeDuplicates(String text){
        String result = "";
   
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            boolean found = false;
			
			
			
            for(int j=0;j<result.length();j++){
                if(result.charAt(j) == ch){
                    found = true;
                    break;
                }
            }

            if(!found)
                result = result + ch;
        }
        return result;
    }
    
public static void main(Strings[] args)
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(removeDuplicates(text));
    }
}
