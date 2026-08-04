package Day_02.HackerRank_based_codebase.MaximumElement;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack= new Stack<>();
        Stack<Integer> maxStack= new Stack<>();
        List<Integer> result = new ArrayList<>();

        for(String operation: operations){
            String[] parts= operation.split(" ");

            if(parts[0].equals("1")){
                int x= Integer.parseInt(parts[1]);
                stack.push(x);

                if(maxStack.isEmpty()){
                    maxStack.push(x);
                }else{
                    maxStack.push(Math.max(x, maxStack.peek()));
                }
            }else if(parts[0].equals("2")){
                stack.pop();
                maxStack.pop();
            }else if(parts[0].equals("3")){
                result.add(maxStack.peek());
            }
        }
        return result;
    }
}

public class maximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
