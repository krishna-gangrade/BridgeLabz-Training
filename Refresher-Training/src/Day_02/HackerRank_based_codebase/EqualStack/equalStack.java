package Day_02.HackerRank_based_codebase.EqualStack;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for(int num : h1){
            sum1 += num;
        }
        for(int num : h2){
            sum2 += num;
        }
        for(int num : h3){
            sum3 += num;
        }

        while(true){
            if(sum1==sum2 && sum2==sum3){
                return sum1;
            }

            if (h1.isEmpty() || h2.isEmpty() || h3.isEmpty()){
                return 0;
            }

            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= h1.get(0);
                h1.remove(0);
            }
            else if(sum2 >= sum1 && sum2 >= sum3){
                sum2 -= h2.get(0);
                h2.remove(0);
            }
            else{
                sum3 -= h3.get(0);
                h3.remove(0);
            }
        }
    }

}

public class equalStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(System.out));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
