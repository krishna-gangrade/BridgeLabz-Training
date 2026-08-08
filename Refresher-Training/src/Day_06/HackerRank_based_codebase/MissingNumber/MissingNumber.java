package Day_06.HackerRank_based_codebase.MissingNumber;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        Collections.sort(arr);
        Collections.sort(brr);

        List<Integer> result=new ArrayList<>();

        int i=0;

        while(i<brr.size()){

            int value=brr.get(i);
            int countBrr=0;

            while(i<brr.size() && brr.get(i).equals(value)){
                countBrr++;
                i++;
            }

            int first=lowerBound(arr, value);

            if(first == arr.size() || !arr.get(first).equals(value)){
                result.add(value);
                continue;
            }
            int last=upperBound(arr, value);

            int countArr=last-first;

            if(countBrr > countArr){
                result.add(value);
            }
        }

        return result;
    }

    private static int lowerBound(List<Integer> arr, int target) {

        int low =0;
        int high =arr.size();

        while(low <high){

            int mid =low +(high-low) / 2;

            if(arr.get(mid) >=target){
                high =mid;
            }else{
                low =mid+1;
            }
        }
        return low;
    }

    private static int upperBound(List<Integer> arr, int target){

        int low =0;
        int high =arr.size();

        while(low <high){

            int mid =low +(high-low) / 2;

            if(arr.get(mid) >target){
                high =mid;
            }else{
                low=mid+1;
            }
        }

        return low;
    }

}

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        System.out.println(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
        );

        bufferedReader.close();
    }
}
