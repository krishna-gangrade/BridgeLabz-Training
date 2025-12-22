//Created utility class to check number properties
import java.util.*;
public class NumberChecker{

    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static boolean isNeon(int n){
        int sq=n*n;
        int sum=0;
        while(sq!=0){
            sum+=sq%10;
            sq/=10;
        }
        return sum==n;
    }

    public static boolean isSpy(int n){
        int sum=0, product=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            product*=d;
            n/=10;
        }
        return sum==product;
    }

    public static boolean isAutomorphic(int n){
        int sq=n*n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n){
        return n%7==0 || n%10==7;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        System.out.println(isPrime(number));
        System.out.println(isNeon(number));
        System.out.println(isSpy(number));
        System.out.println(isAutomorphic(number));
        System.out.println(isBuzz(number));
    }
}
