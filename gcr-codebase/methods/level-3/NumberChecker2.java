//Created utility class to perform number checks
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

    public static int sumOfDigits(int[] digits){
        int sum=0;
        for(int i=0;i<digits.length;i++)
            sum+=digits[i];
        return sum;
    }

    public static double sumOfSquares(int[] digits){
        double sum=0;
        for(int i=0;i<digits.length;i++)
            sum+=Math.pow(digits[i],2);
        return sum;
    }

    public static boolean isHarshad(int number,int[] digits){
        int sum=sumOfDigits(digits);
        return number%sum==0;
    }

    public static int[][] digitFrequency(int[] digits){
        int[][] freq=new int[10][2];

        for(int i=0;i<10;i++)
            freq[i][0]=i;

        for(int i=0;i<digits.length;i++)
            freq[digits[i]][1]++;

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int[] digits=getDigits(number);

        System.out.println(sumOfDigits(digits));
        System.out.println(sumOfSquares(digits));
        System.out.println(isHarshad(number,digits));

        int[][] freq=digitFrequency(digits);
        for(int i=0;i<10;i++){
            if(freq[i][1]>0)
                System.out.println(freq[i][0]+" "+freq[i][1]);
        }
    }
}
