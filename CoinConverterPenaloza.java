package Labs;
/*
1.Jordan Penaloza
2. 6/6/2022
3. This program converts the number of pennies you have in terms of dollars, quarters, dimes, nickels, and pennies.
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
*/
public class CoinConverterPenaloza
{
   public static void main(String[] args)
   {
	   description();
	   convert();
   }
   public static void description()
   {
      System.out.println("Welcome to the Coin Converter");
      System.out.println("Tell me the number of pennies you have please!");
      System.out.println("I will tell you the number of dollars, quarters, dimes, nickels, and pennies you have");
   }
   //Displays the purpose of the converter
   public static void convert()
   {
	   
	   int numPennies = 6789; //Insert number of pennies here
	   
	   int numDollars = numPennies / 100;
	   int numPennies2 = numPennies % 100;	  
	   int numQuarters = numPennies2 / 25;
	   int numPennies3 = numPennies2 % 25;
	   int numDimes = numPennies3 / 10;
	   int numPennies4 = numPennies3 % 10;
	   int numNickels = numPennies4 / 5;
	   int numPennies5 = numPennies4 % 5;
	   int numPennies6 = numPennies5 / 1;	
	   System.out.println(numPennies + " pennies are equal to:");
	   System.out.println(numDollars + " dollar(s)");
	   System.out.println(numQuarters + " quarter(s)");
	   System.out.println(numDimes + " dime(s)");
	   System.out.println(numNickels + " nickel(s)");
	   System.out.println(numPennies6 + " pennie(s)");	  
	   
   }
   //Converts pennies into dollars, quarters, dimes, nickels, and pennies then displays the result
}