package Labs;
/*
1.Jordan Penaloza
2. 7/3/2022
3. This program simulates a trivia game in which questions are asked for the user to answer
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
*/
import java.util.*;
public class TriviaGamePenaloza{
public static final int SIZE = 5;

     
    public static void main(String[] args)
    {
    	run();
    	//calls the run method
    }
    public static void run()
    {
    	Scanner kb = new Scanner(System.in);
    	String[] questions = new String [SIZE];
    	String[] answers = new String [SIZE];
    	int[] values = new int [SIZE];
    	initialize(questions, answers, values);
    	boolean more = true;
    	while(more){
    		play(questions, answers, values, kb);
    		System.out.println("Your score is: " + play(questions, answers, values, kb));
    		System.out.println("Does someone else want to play? (yes/y)");
    		String decision = kb.next();
    		if (!(decision.equals("yes")) || decision.equals("y")) {
    			more = false;
//Runs the program by calling the initialize and play methods
    		}
    		
    	}
             kb.close();
    }
    public static void initialize(String[] questions, String[] answers, int[] 
    		values)
    { 
    	questions[0] = "The first CS class you take as a CS major";			
    	answers[0] =  "csc 10";
    	values[0] = 1;
    	
    	questions[1] = "The last CS course required for a CPE major";			
    	answers[1] =  "csc 130";
    	values[1] = 2;
    	
    	questions[2] = "The language taught in beginner CS courses";			
    	answers[2] =  "java";
    	values[2] = 3;
    	
    	questions[3] = "The first CS class you are required to take as a CPE major";			
    	answers[3] =  "csc 15";
    	values[3] = 4;
    	
    	questions[4] = "The name of our CSC 15 professor";			
    	answers[4] =  "Gita Farougi";
    	values[4] = 5;
    	//initializes the questions and answers inside arrays
    }

    public static int play(String[] questions, String[] answers, int[] values, Scanner kb)
    {
    	int score = 0;
    	for (int i = 0; i <= score; i++) {
    		System.out.println(questions[i]);
    		String answer = kb.nextLine();
    		answer.toLowerCase();
    		if (answer.toLowerCase().equals(answers[i]))  {
    			System.out.println("Nice job, that's correct");
    			score++;
    		}
    		else {
    			System.out.println("Incorrect, the correct answer was " + answers[i]);
    		}
    	
    	}
    	return score;
   //Creates a for loop that asks the user questions and tells if the user is correct or incorrect, then updates the user's score
}
} 

 