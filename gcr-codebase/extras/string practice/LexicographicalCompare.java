import java.util.Scanner;
public class LexicographicalCompare {

    //compare characters one by one using ASCII values
    public static int compareStrings(String a,String b){
        int minLen = a.length() < b.length() ? a.length() : b.length();

        for(int i=0;i<minLen;i++){
            if(a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        }

        //if all compared characters are equal, shorter string comes first
        return a.length() - b.length();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int result = compareStrings(s1,s2);

        if(result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        else if(result > 0)
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        else
            System.out.println("Both strings are equal");
    }
}
