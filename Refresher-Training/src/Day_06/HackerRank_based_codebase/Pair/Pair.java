package Day_06.HackerRank_based_codebase.Pair;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int pairs(int k, List<Integer> arr) {

        Collections.sort(arr);

        int count =0;
        for(int i =0; i<arr.size();i++){
            int target =arr.get(i)+k;
            if(binarySearch(arr, target)){
                count++;
            }
        }
        return count;
    }

    private static boolean binarySearch(List<Integer> arr, int target) {

        int low =0;
        int high =arr.size()-1;

        while(low<=high){

            int mid =low +(high-low) / 2;
            if(arr.get(mid) ==target){
                return true;
            }
            if(arr.get(mid)< target){
                low =mid+1;
            }else{
                high =mid-1;
            }
        }
        return false;
    }
}

public class Pair {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pairs(k, arr);

        System.out.println(result);

        bufferedReader.close();
    }
}
