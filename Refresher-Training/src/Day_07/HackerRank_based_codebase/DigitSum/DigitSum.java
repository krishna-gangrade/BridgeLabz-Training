package Day_07.HackerRank_based_codebase.DigitSum;


import java.io.*;

class Result {

    public static int superDigit(String n, int k) {
        long sum = 0;

        for(char c : n.toCharArray()){
            sum = sum + c - '0';
        }
        sum = sum * k;

        if(sum < 10){
            return (int) sum;
        }

        return superDigit(String.valueOf(sum), 1);
    }

}

public class DigitSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        System.out.println(result);


        bufferedReader.close();
    }
}
