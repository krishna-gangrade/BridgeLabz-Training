package Day_02.HackerRank_based_codebase.SimpleTextEditor;

import java.util.*;

public class simpleTextEditor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Q = Integer.parseInt(input.nextLine().trim());

        StringBuilder s = new StringBuilder();
        Stack<String> history = new Stack<>();

        for(int i = 0; i < Q; i++){
            String[] parts = input.nextLine().split(" ");
            int type =Integer.parseInt(parts[0]);

            if(type == 1){
                history.push(s.toString());
                s.append(parts[1]);
            }else if(type == 2){
                history.push(s.toString());
                int k =Integer.parseInt(parts[1]);
                s.delete(s.length() - k, s.length());
            }else if(type == 3){
                int k =Integer.parseInt(parts[1]);
                System.out.println(s.charAt(k - 1));
            }else if(type == 4){
                s =new StringBuilder(history.pop());
            }
        }
    }
}