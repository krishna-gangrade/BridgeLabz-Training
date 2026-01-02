/*

Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.

*/

//Create a class OnlineQuizApplication to print questions and options and take user input and at last give the score 
import java.util.Scanner;

public class OnlineQuizApplication{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Welcome to Online Quiz Assessment\n");
		
		int scoreChecker=0;
		
		//Array of question
		String [] questions= {
		"1. Which component is used to compile, debug and execute the java programs?", 
		"2. Which one of the following is not a Java feature?",
		"3. Which of these cannot be used for a variable name in Java?",
		"4. What is the extension of java code files?",
		"5. What is the extension of compiled java classes?"
		};
		
		//Array of option
		String [] options= {
		"a) JRE\nb) JIT\nc) JDK\nd) JVM",
		"a) Object-oriented\nb) Use of pointers\nc) Portable\nd) Dynamic and Extensible\n",
		"a) identifier & keyword\nb) identifier\nc) keyword\nd) none of the mentioned\n",
		"a) .js\nb) .txt\nc) .class\nd) .java\n",
		"a) .txt\nb) .js\nc) .class\nd) .java\n"
		};
		
		//loop for 
		for(int i=0;i<questions.length;i++){
			
			System.out.println(questions[i]);
			System.out.println(options[i]);
			
			System.out.println("\nWrite one of the above option alphabet : ");
			char alphabet= input.nextLine().charAt(0);
			
			switch(i){
				
				case 0:{
					if(alphabet=='c'){
						scoreChecker++;
					}
					break;
				}
				
				case 1:{
					if(alphabet=='b'){
						scoreChecker++;
					}
					break;
				}
				case 2:{
					if(alphabet=='c'){
						scoreChecker++;
					}
					break;
				}
				case 3:{
					if(alphabet=='d'){
						scoreChecker++;
					}
					break;
				}
				case 4:{
					if(alphabet=='c'){
						scoreChecker++;
					}
					break;
				}
			}
		}
		System.out.println("Quiz Completed !!!");
		System.out.println("Your score : "+ scoreChecker);
		
		input.close();
	}
}