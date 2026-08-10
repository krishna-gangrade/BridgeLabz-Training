package Day_07.HackerRank_based_codebase.Recursion;

import java.io.*;

class Result {

    public static int factorial(int n) {

        if(n==0 || n==1){
            return 1;
        }

        return n* factorial(n-1);
    }

}

public class RecursionFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        System.out.println(result);

        bufferedReader.close();
    }
}
