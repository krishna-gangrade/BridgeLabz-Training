//Create a class MatrixToArray to convert a 2-D array into 1-D array
import java.util.*;

public class MatrixToArray{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter row :");
		int rows= input.nextInt();
		
		System.out.println("Enter column :");
		int columns= input.nextInt();
		
		//2-D Array
		int [][] matrix= new int[rows][columns];
		
		//1-D Array
		int [] array= new int[rows*columns];
		
		//Inserting elements into matrix
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println("Enter element :");
				matrix[i][j]= input.nextInt();
			}
		}
		
		//Variable is created to store index of array
		int index=0;
		
		//To insert element into array
		for(int i=0; i<rows;i++){
			for(int j=0;j<columns;j++){
				array[index]=matrix[i][j];
				index++;
			}
		}
		
		//Display 1-D array
		for(int i=0;i<(rows*columns);i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		//Display 2-D array
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}