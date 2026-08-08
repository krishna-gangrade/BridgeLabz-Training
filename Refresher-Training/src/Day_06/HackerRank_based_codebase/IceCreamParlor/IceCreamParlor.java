package Day_06.HackerRank_based_codebase.IceCreamParlor;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        List<Integer> result = new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j)==m){
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
            }
        }
        return result;
    }

}

public class IceCreamParlor {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < t; i++) {

            int m = Integer.parseInt(bufferedReader.readLine().trim());

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(
                            bufferedReader.readLine().trim().split(" ")
                    )
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result =
                    Result.icecreamParlor(m, arr);

            System.out.println(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
            );
        }

        bufferedReader.close();
    }
}
