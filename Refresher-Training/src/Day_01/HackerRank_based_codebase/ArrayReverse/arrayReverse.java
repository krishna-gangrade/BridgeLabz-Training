package Day_01.ArrayReverse;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> reverseArray(List<Integer> a){
        List<Integer> result = new ArrayList<>();
        for (int i =a.size()-1;i>=0;i--){
            result.add(a.get(i));
        }
        return result;
    }
}

public class arrayReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine());

        List<Integer> arr = Stream.of(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(
                res.stream()
                        .map(String::valueOf)
                        .collect(joining(" "))
        );
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}