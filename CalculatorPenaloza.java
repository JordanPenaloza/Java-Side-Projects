package Labs;

/*
1.Jordan Penaloza
2. 6/18/2022
3. This program performs simple calculations given 2 numbers and an operation.
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
*/
import java.util.Scanner;
public class CalculatorPenaloza
{
   public static void main(String[] args)
   {
	   run();
   }
   public static void run()
   {
	   
	   Scanner kb = new Scanner(System.in); 
	   System.out.println("How many operations would you like to complete?");       
	   int operations = kb.nextInt();
	   
        for(int i = 0; i < operations; i++) {
         menu();                
         System.out.print("Enter the operation: ");        
         String operator = kb.next();
         System.out.print("Enter a number between 0 - 9: ");
         int operand1 = kb.nextInt();
         System.out.print("Enter a number between 0 - 9: ");
         int operand2 = kb.nextInt();
         double result = calculate(operand1,operand2,operator);
         System.out.println(convertNumToWord(operand1) + " " + convert(operator) + " " + convertNumToWord(operand2) + " equals " + result);
         System.out.println();
        }
         //runs the calculator
          
   }
   
   
      public static String convert(String op)
   {
     switch(op)
     {
        case("*"): return "mulitplied by";
        case("/"): return "divided by";
        case("^"): return "to the power of";
        case("%"): return "modulus";
        case("+"): return "plus";
        case("-"): return "minus";
        
        
     }
     return "";   
   }
   
   public static String convertNumToWord(int a)
   {
      if (a == 1)
          return "one";
      else if(a == 2)
    	  return "two";
      else if(a == 3)
    	  return "three";
      else if(a == 4)
    	  return "four";
      else if(a == 5)
    	  return "five";
      else if(a == 6)
    	  return "six";
      else if(a == 7)
    	  return "seven";
      else if(a == 8)
    	  return "eight";
      else if(a == 9)
    	  return "nine";
      
      

         
      return "";  
   }
   //converts numbers to words
   public static double calculate(double a, double b, String operator)
   {
      if(operator.equals("*"))
         return a * b;
      	else if(operator.equals("/"))
          return a / b;
      	else if(operator.equals("+"))
          return a + b;
      	else if(operator.equals("-"))
          return a - b;
      	else if(operator.equals("%"))
          return a % b;
      	else if(operator.equals("^"))
      		return Math.pow(a, b);
      
      //calculates values
      
        
       return 0;            
   }
   public static void menu()
   {
	   for (int q = 0; q <= 40; q++) {
		   System.out.print("*");
	   }
	   System.out.println();
		   
	   System.out.println("To do addition enter +\n"
	   		+ "To do multiplication enter *\n"
	   		+ "To do subtraction enter -\n"
	   		+ "To do exponent enter ^\n"
	   		+ "to do division enter /\n"
	   		+ "To do modulus enter %");
	   for (int q = 0; q <= 40; q++) {
		   System.out.print("*");
	   }
	   System.out.println();
      //Displays the menu
   }
}