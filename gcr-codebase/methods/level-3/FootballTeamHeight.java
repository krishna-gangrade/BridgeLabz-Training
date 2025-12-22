//Created class to find shortest, tallest and mean height

import java.util.*;

public class FootballTeamHeight {

    public static int findSum(int[] heights){
        int sum=0;
        for(int i=0;i<heights.length;i++)
            sum+=heights[i];
        return sum;
    }

    public static double findMean(int[] heights){
        return (double)findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights){
        int min=heights[0];
        for(int i=1;i<heights.length;i++)
            if(heights[i]<min)
                min=heights[i];
        return min;
    }

    public static int findTallest(int[] heights){
        int max=heights[0];
        for(int i=1;i<heights.length;i++)
            if(heights[i]>max)
                max=heights[i];
        return max;
    }

    public static void main(String[] args){
        int[] heights=new int[11];

        for(int i=0;i<heights.length;i++){
            heights[i]=(int)(Math.random()*101) + 150;
        }

        System.out.println(findShortest(heights));
        System.out.println(findTallest(heights));
        System.out.println(findMean(heights));
    }
}
