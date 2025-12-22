//Created utility class to work with factors
import java.util.*;
public class FactorOperations{

    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                count++;
        }

        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors){
        int max=factors[0];
        for(int i=1;i<factors.length;i++){
            if(factors[i] > max)
                max=factors[i];
        }
        return max;
    }

    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int i=0;i<factors.length;i++)
            sum+=factors[i];
        return sum;
    }

    public static long productOfFactors(int[] factors){
        long product=1;
        for(int i=0;i<factors.length;i++)
            product*=factors[i];
        return product;
    }

    public static double productOfCubes(int[] factors){
        double product=1;
        for(int i=0;i<factors.length;i++)
            product*=Math.pow(factors[i],3);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int[] factors=findFactors(number);

        System.out.println(greatestFactor(factors));
        System.out.println(sumOfFactors(factors));
        System.out.println(productOfFactors(factors));
        System.out.println(productOfCubes(factors));
    }
}
