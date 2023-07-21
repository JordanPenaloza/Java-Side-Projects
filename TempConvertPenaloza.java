package Labs;
/*
1.Jordan Penaloza
2. 6/9/2022
3. This program converts the temperature from centigrade to fahrenheit
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
*/
public class TempConvertPenaloza
{
	public static final double CENTI_TO_FAHR = 9.0 / 5;
   //declares the class constant   
   public static void main (String[] args)
   {
   description();
   centiToFar(); 
   }
   //calls description and conversion
   public static void centiToFar()
   {
	   for (int i = 0; i <= 9; i++) {
		   double fahrenheit = 0;
		   fahrenheit = CENTI_TO_FAHR * i + 32;
		   System.out.println(i + "                             " + (int)fahrenheit);		   
	   }
	   for (int i = 10; i <= 45; i++) {
		   double fahrenheit = 0;
		   fahrenheit = CENTI_TO_FAHR * i + 32;
		   System.out.println(i + "                            " + (int)fahrenheit);
	   }
	
	 //converts centigrade to farenheit
       
          
   }
   public static void description()
   {
	for (int q = 1; q <= 2; q++) { 				
     for (int i = 1; i <= 80; i++ ) {    	 
    	 System.out.print("*");    	
   }
     System.out.println(" ");
	}
	System.out.println("Welcome to the Temperature Converter Program!");
	System.out.println("This program will provide the temperature in both Centigrade and Fahrenheit.");
	
	for (int q = 1; q <= 2; q++) { 				
	     for (int i = 1; i <= 80; i++ ) {    	 
	    	 System.out.print("*");    	
	   }
	     System.out.println(" ");
		}
	System.out.println("Centigrade                    Fahrenheit");
	//prints description for program
   }
}