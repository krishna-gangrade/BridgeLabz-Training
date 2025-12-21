//Create a class YoungestAndTallestFriend to find who is youmgest and tallest among them
import java.util.*;

public class YoungestAndTallestFriend{

    public static void main(String args[]){

        Scanner input= new Scanner(System.in);

        String[] names={"Amar", "Akbar", "Anthony"};
        int[] age= new int[3];
        double[] height= new double[3];

        //Input loop
        for(int i=0;i<3;i++){
            System.out.println("Enter details for "+names[i]);

            System.out.println("Enter Age: ");
            age[i]=input.nextInt();

            System.out.println("Enter Height: ");
            height[i]=input.nextDouble();
        }
		
        int youngestIndex=0;
        int tallestIndex=0;

        // Loop to find youngest and tallest
        for(int i=1;i<3;i++){

            if(age[i]<age[youngestIndex]){
                youngestIndex=i;
            }
            if(height[i]>height[tallestIndex]){
                tallestIndex=i;
            }
        }

        //Displays the result
        System.out.println("\nYoungest Friend : " + names[youngestIndex]);
        System.out.println("Tallest Friend  : " + names[tallestIndex]);
		
    }
}
