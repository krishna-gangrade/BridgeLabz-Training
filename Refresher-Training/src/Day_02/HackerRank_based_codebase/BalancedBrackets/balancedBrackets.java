package Day_02.HackerRank_based_codebase.BalancedBrackets;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static String isBalanced(String s) {

        Stack<Character> stack =new Stack<>();

        for(int i =0;i<s.length();i++){
            char ch =s.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return "NO";
                }
                char top =stack.peek();
                if((ch==')'&&top=='(') ||
                        (ch=='}'&&top=='{') ||
                        (ch==']'&&top=='[')){
                    stack.pop();
                }else{
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}

public class balancedBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
