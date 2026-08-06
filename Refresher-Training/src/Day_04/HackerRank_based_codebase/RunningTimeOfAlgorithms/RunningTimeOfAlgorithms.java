package Day_04.HackerRank_based_codebase.RunningTimeOfAlgorithms;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int runningTime(List<Integer> arr) {

        int shifts =0;
        for(int i=1;i<arr.size();i++){
            int key =arr.get(i);
            int j=i-1;
            while(j>=0 && arr.get(j)>key){
                arr.set(j+1, arr.get(j));
                shifts++;
                j--;
            }
            arr.set(j+1 , key);
        }
        return shifts;
    }

}

public class RunningTimeOfAlgorithms {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
