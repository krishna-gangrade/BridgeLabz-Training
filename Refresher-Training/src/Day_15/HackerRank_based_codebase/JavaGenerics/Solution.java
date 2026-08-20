package Day_15.HackerRank_based_codebase.JavaGenerics;

class Box{
    public <T> void print(T[] arr){
        for(T t: arr){
            System.out.println(t);
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] intArr= {1,2,3};
        String[] strArr={"Hello","World"};

        Box p= new Box();

        p.print(intArr);
        p.print(strArr);
    }
}