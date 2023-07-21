package Labs;
/*
1. Jordan Penaloza
2. 6/13/2022
3. This program calculates the profit gained from buying and selling stocks
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
 */
import java.util.*;
public class NarrativePenaloza
{
  /* calls narrative method to write a story
  
  */
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many stories are you making: ");
    int next = sc.nextInt();
    sc.nextLine();
    for(int q = 1; q <= next; q++)
    {
      System.out.println("Answer a few questions and I will make up a story for you\n");
      narrative(sc);
    }
  }
  /*asks user questions and writes a story with the answers*/
  public static void narrative(Scanner sc)
  {
	  String name;	  
	  String country;
	  int residents;
	  int kids;
	  double salary;
	  String favFood;
	  String schoolName;
	  String favSport;
	  int payRate;
	  String momName;
	  String dadName;
 
	  System.out.println("What is your name? ");
	  name =  sc.nextLine();
	  System.out.println("What country do you live in? (Type the country abbreviation, ex: United States = US) ");
	  String n1 = name.substring(0,1);
	  country = sc.next();
	  System.out.println("How many residents do you think live in " + country + "? ");
	  residents = sc.nextInt();
	  System.out.println("How many kids do you have? ");
	  kids = sc.nextInt();
	  System.out.println("What is your salary? ");
	  salary = sc.nextDouble();
	  System.out.println("What is your favorite food? ");
	  favFood = sc.next();
	  System.out.println("What is the name of your school? (Type the abbreviate of the school, ex: Sac State Uni = SSU) ");
	  sc.nextLine();
	  schoolName = sc.nextLine();
	  	 
	  System.out.println("What is your favorite sport? ");
	  favSport = sc.nextLine();
	  System.out.println("What is the minimum wage of where you live? ");
	  payRate = sc.nextInt();
	  System.out.println("What is your mom's name? ");
	  momName = sc.next();
	  System.out.println("What is your dad's name? ");
	  dadName = sc.next();
	  int newPop = Math.subtractExact(residents, 2000);
	  int newPay = Math.multiplyExact(payRate, 2);
	  double newSal = Math.pow(salary, 2);
	  String myStory = name + " lives in a far away land known as " + country + " with a population of " + residents + ". " + "The first letter of their name is " + n1
	        + "\n" + name + " loves to play "
	  		+ favSport + " and so do his kids. " + "\n" + name + " has " + kids + " kids and they all love playing " + favSport + ". "
	  		+ "\n" + "Unfortunately their grandparents were secretely terrorists and dropped a bomb that kills 2000 people " + country
	  		+ ". " + "The population of " + country + " is now " + newPop + ". " + "\n" + "The name of " + name + "'s parents and their kid's grandparents are "
	  		+ dadName + " " + momName + ". " + "\n" + "They both graduated from " + schoolName + ". " + "\n" + "Due to the bombing, minimum wage raised and so did "
	  		+ name + "'s salary.\nMinimum wage before the bombing was " + payRate + " and their salary was " + salary + ". " + "\n" + "The new minimum wage is now "
	  		+ newPay + " and the new salary is " + newSal + ". " + "\n"
	  		+ "To apologize for the bombing " + dadName + " made " + name + " his favorite dish called " + favFood + ".";
	  		System.out.print(myStory);
	  
			  
	  
}
}