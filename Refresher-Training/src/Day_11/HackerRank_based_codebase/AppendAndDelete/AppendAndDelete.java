package Day_11.HackerRank_based_codebase.AppendAndDelete;

import java.io.*;

class Result {

    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */

    public static String appendAndDelete(String s, String t, int k) {

        int common=0;

        while(common< s.length() && common< t.length() && s.charAt(common)== t.charAt(common)){
            common++;
        }

        int delete= s.length()- common;
        int append= t.length()- common;
        int minimum= delete+ append;

        if(k>= s.length()+ t.length()){
            return "Yes";
        }
        if(k>= minimum && (k-minimum)%2==0){
            return "Yes";
        }

        return "No";
    }

}

public class AppendAndDelete {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
