package Day_01.CamelCase;

import java.io.*;

class Result {

    public static int camelcase(String s) {
        int counter = 1;
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch >='A' && ch <='Z') {
                counter++;
            }
        }
        return counter;
    }
}

public class camelCase {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int result = Result.camelcase(s);
        System.out.println(result);
        bufferedReader.close();
    }
}