package Day_02.HackerRank_based_codebase.TruckTour;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int truckTour(List<List<Integer>> petrolpumps) {
        int start =0;
        int fuel =0;
        int total =0;

        for(int i=0;i<petrolpumps.size();i++){

            int petrol=petrolpumps.get(i).get(0);
            int distance=petrolpumps.get(i).get(1);

            int gain=petrol-distance;

            fuel+=gain;
            total+=gain;

            if(fuel<0){
                start=i+1;
                fuel=0;
            }
        }

        return total>=0?start:-1;
    }

}

public class truckTour {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> petrolpumps = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                petrolpumps.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.truckTour(petrolpumps);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

