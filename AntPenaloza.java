package Labs;
/*
1.Jordan Penaloza
2. 7/1/2022
3. This program simulates an ant crawling up a building.
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
*/
import java.util.*;
public class AntPenaloza
{
  public static void main(String [] args)
  {
	  Random rand = new Random ();
	  Scanner kb = new Scanner(System.in);
	  run(rand, kb);
    //runs the run method
  }
  public static void run(Random rand, Scanner kb)
  {
	  String runAgain = "yes";
      Random random = new Random();
      while (wantToRunAgain(runAgain)) {
          int height = getHeight(kb);

              long falls = move(height, random);
              System.out.println();
              System.out.println("Whilst walking up " + height + " steps, the ant fell " + falls + " times before reaching the top.");
              runAgain = askStringAnswer("Want to run the program again? (y/n)", kb);
              System.out.println();
	  
      }
	
     //runs the program
  }
      public static boolean wantToRunAgain(String runAgain){
          return (runAgain.equalsIgnoreCase("y") || runAgain.equalsIgnoreCase("yes")
                  || runAgain.equalsIgnoreCase("1")  || runAgain.equalsIgnoreCase("true"));
          
      }
      public static String askStringAnswer(String question, Scanner kb){
          kb.nextLine();
          System.out.println(question);
          return kb.nextLine();
          
      }

  public static int getHeight(Scanner kb)
  {
	  System.out.println("What will the height of the building be?: ");
      while (!kb.hasNextInt()){
          System.out.println("What will the height of the building be?; ");
          kb.next();
      }
      return kb.nextInt();
 
  }
  //gets the height given from the user
  public static int move(int h, Random rand)
  {
	  int distance = 0;
	  int fall = 0;
	  do {
		  int num;
		  num = rand.nextInt(2);
		  if (num == 1) {
			  distance++;
		  }
		  else if (num == 0) {
			  fall++;
		  }
	  }while (distance != fall);
	  
    return  fall; 
    //moves the ant based on whether it falls or moves up
  }
}