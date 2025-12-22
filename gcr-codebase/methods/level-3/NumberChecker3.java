//Created utility class for number checking
import java.util.*;
public class NumberChecker{

    public static int countDigits(int number){
        int count=0;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }

    public static int[] getDigits(int number){
        int count=countDigits(number);
        int[] digits=new int[count];

        for(int i=0;i<count;i++){
            digits[i]=number % 10;
            number/=10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits){
        int[] rev=new int[digits.length];
        for(int i=0;i<digits.length;i++)
            rev[i]=digits[digits.length-1-i];
        return rev;
    }

    public static boolean compareArrays(int[] a,int[] b){
        if(a.length!=b.length)
            return false;

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits){
        int[] rev=reverseDigits(digits);
        return compareArrays(digits,rev);
    }

    public static boolean isDuck(int[] digits){
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int[] digits=getDigits(number);

        System.out.println(isPalindrome(digits));
        System.out.println(isDuck(digits));
    }
}
