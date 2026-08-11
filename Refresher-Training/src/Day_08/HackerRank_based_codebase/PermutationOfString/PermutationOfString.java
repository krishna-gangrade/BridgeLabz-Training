package Day_08.HackerRank_based_codebase.PermutationOfString;

import java.util.*;

public class PermutationOfString {

    public static boolean nextPermutation(String[] s) {

        int n = s.length;

        int i = n - 2;

        while(i >= 0 && s[i].compareTo(s[i + 1]) >= 0){
            i--;
        }

        if(i < 0){
            return false;
        }

        int j = n-1;
        while(s[j].compareTo(s[i]) <= 0){
            j--;
        }

        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        int left = i +1;
        int right = n -1;

        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }



        do {
            for (int i = 0; i < n; i++) {

                System.out.print(s[i]);

                if (i < n - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();

        } while (nextPermutation(s));

        sc.close();
    }
}