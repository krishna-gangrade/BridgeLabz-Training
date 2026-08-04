package Day_02.HackerRank_based_codebase.QueueUsingTwoStack;

import java.util.*;

public class queueUsingTwoStack{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        for(int i =0;i<n;i++){
            int op =kb.nextInt();
            if(op ==1){
                input.push(kb.nextInt());
            }else if(op ==2){
                if(output.empty()){
                    while(!input.empty()){
                        output.push(input.pop());
                    }
                }
                output.pop();
            }else if(op ==3){
                if(output.empty()){
                    while(!input.empty()){
                        output.push(input.pop());
                    }
                }
                System.out.println(output.peek());
            }
        }
        kb.close();
    }
}