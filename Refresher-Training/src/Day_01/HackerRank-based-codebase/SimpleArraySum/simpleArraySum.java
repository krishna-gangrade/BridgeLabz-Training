package Day_01.SimpleArraySum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}

public class simpleArraySum {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> ar = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int result = Result.simpleArraySum(ar);
        System.out.println(result);
        bufferedReader.close();
    }
}