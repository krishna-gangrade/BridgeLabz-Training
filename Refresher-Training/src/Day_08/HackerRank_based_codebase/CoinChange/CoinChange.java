package Day_08.HackerRank_based_codebase.CoinChange;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static long getWays(int n, List<Long> c) {

        long[] dp = new long[n+1];
        dp[0] = 1;

        for(long coin :c){
            for (int amount =(int)coin;amount<=n;amount++){

                dp[amount] = dp[amount]+dp[amount-(int)coin];
            }
        }
        return dp[n];
    }

}

public class CoinChange {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());


        long ways = Result.getWays(n, c);

        System.out.println(ways);

        bufferedReader.close();
    }
}
