package Day_04.HackerRank_based_codebase.InsertionSortP2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void insertionSort2(int n, List<Integer> arr) {

        for(int i=1;i<n;i++){
            int key=arr.get(i);
            int j=i-1;

            while(j>=0 && arr.get(j)>key){
                arr.set(j+1,arr.get(j));
                j--;
            }
            arr.set(j+1,key);
            printArray(arr);
        }
    }

    static void printArray(List<Integer> arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

public class InsertionSortP2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort2(n, arr);

        bufferedReader.close();
    }
}
