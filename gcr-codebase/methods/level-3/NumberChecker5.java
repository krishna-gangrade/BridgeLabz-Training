//Created utility class to check number types
import java.util.*;
public class NumberChecker{

    public static int sumOfProperDivisors(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }

    public static boolean isPerfect(int n){
        return sumOfProperDivisors(n) == n;
    }

    public static boolean isAbundant(int n){
        return sumOfProperDivisors(n) > n;
    }

    public static boolean isDeficient(int n){
        return sumOfProperDivisors(n) < n;
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }

    public static boolean isStrong(int n){
        int temp=n;
        int sum=0;

        while(temp!=0){
            int d=temp % 10;
            sum+=factorial(d);
            temp/=10;
        }
        return sum==n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println(isPerfect(number));
        System.out.println(isAbundant(number));
        System.out.println(isDeficient(number));
        System.out.println(isStrong(number));
    }
}
