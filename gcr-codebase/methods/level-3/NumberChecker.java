//Created utility class for number checking
import java.util.*;

public class NumberChecker{

    public static int countDigits(int n){
        int c=0;
        while(n!=0){ c++;n/=10; }
        return c;
    }

    public static int[] getDigits(int n,int c){
        int[] d=new int[c];
        for(int i=0;i<c;i++){ d[i]=n%10; n/=10; }
        return d;
    }

    public static boolean isDuck(int[] d){
        for(int i=0;i<d.length;i++)
            if(d[i]!=0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] d){
        int sum=0;
        for(int i=0;i<d.length;i++)
            sum+=Math.pow(d[i],d.length);
        int num=0;
        for(int i=d.length-1;i>=0;i--)
            num=num*10+d[i];
        return sum==num;
    }

    public static int[] findLargest(int[] d){
        int max=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int i=0;i<d.length;i++){
            if(d[i]>max){ second=max; max=d[i]; }
            else if(d[i]>second && d[i]!=max) second=d[i];
        }
        return new int[]{max,second};
    }

    public static int[] findSmallest(int[] d){
        int min=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        for(int i=0;i<d.length;i++){
            if(d[i]<min){ second=min; min=d[i]; }
            else if(d[i]<second && d[i]!=min) second=d[i];
        }
        return new int[]{min,second};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int c=countDigits(n);
        int[] d=getDigits(n,c);

        System.out.println(isDuck(d));
        System.out.println(isArmstrong(d));

        int[] l=findLargest(d);
        System.out.println(l[0]+" "+l[1]);

        int[] s=findSmallest(d);
        System.out.println(s[0]+" "+s[1]);
    }
}
