package Day_04.HackerRank_based_codebase.InsertionSortP1;


import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void insertionSort1(int n, List<Integer> arr) {
        int val = arr.get(n - 1);
        int i = n - 2;

        while(i >=0 && arr.get(i) >val){
            arr.set(i+1, arr.get(i));
            printList(arr);
            i--;
        }

        arr.set(i+1, val);
        printList(arr);

    }

    static void printList(List<Integer> arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

public class InsertionSortP1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
