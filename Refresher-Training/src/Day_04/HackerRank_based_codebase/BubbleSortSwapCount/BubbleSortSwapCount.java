package Day_04.HackerRank_based_codebase.BubbleSortSwapCount;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void countSwaps(List<Integer> a) {

        int count = 0;
        int n = a.size();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(a.get(j)>a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    count++;
                }
            }
        }

        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));

    }

}

public class BubbleSortSwapCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
