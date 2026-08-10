package Day_07.HackerRank_based_codebase.DavisStaircase;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    static long[] memo;

    public static int stepPerms(int n) {
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        return (int) solve(n);
    }

    static long solve(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (memo[n] != -1) return memo[n];

        return memo[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
    }

}

public class DavisStaircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, s).forEach(sItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int res = Result.stepPerms(n);

                System.out.println(res);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
