//Create a class YoungestAndTallest and find the youngest and tallest among three friends
import java.util.*;

public class YoungestAndTallest{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Age and Height of Amar
		int ageAmar= kb.nextInt();
		int heightAmar= kb.nextInt();
		
		//Age and Height of Akbar
		int ageAkbar= kb.nextInt();
		int heightAkbar= kb.nextInt();
		
		//Age and Height of Anthony
		int ageAnthony= kb.nextInt();
		int heightAnthony= kb.nextInt();
		
		//Condition for youngest and print the result
		if(ageAmar<ageAkbar && ageAmar<ageAnthony){
			System.out.println("Amar is youngest with age = "+ageAmar);
		}
		else if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
			System.out.println("Akbar is youngest with age = "+ageAkbar);
		}else{
			System.out.println("Anthony is youngest with age = "+ageAnthony);
		}
		
		//Condition for tallest and print the result
		if(heightAmar>heightAkbar && heightAmar>heightAnthony){
			System.out.println("Amar is tallest with height = "+heightAmar);
		}
		else if(heightAkbar>heightAmar && heightAkbar>heightAnthony){
			System.out.println("Akbar is tallest with height = "+heightAkbar);
		}else{
			System.out.println("Anthony is tallest with height = "+heightAnthony);
		}
	}
}