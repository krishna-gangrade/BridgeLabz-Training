package Day_01.SherlockAndAnagrams;


import java.io.*;

        import java.util.*;

        import java.util.stream.*;

class Result {



    public static int sherlockAndAnagrams(String s) {

        HashMap<String, Integer> map =new HashMap<>();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                String sub =s.substring(i,j);
                char[] arr =sub.toCharArray();
                Arrays.sort(arr);

                String key = new String(arr);
                map.put(key, map.getOrDefault(key, 0) +1);
            }
        }

        int ans =0;
        for(int freq :map.values()){
            ans +=freq*(freq-1)/2;
        }
        return ans;
    }
}

public class sherlockAndAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
