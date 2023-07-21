package Labs;
/*
1. Jordan Penaloza
2. 6/12/2022
3. This program calculates the profit gained from buying and selling stocks
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
 */
import java.util.*;
public class StockPenaloza
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		description();
		run(kb);

	}
	/* Calls methods  */
	public static void run(Scanner kb)
	{	  

		System.out.println();
		System.out.print("Enter the number of customers using this app-->");
		int customers = kb.nextInt();	 
		for (int i = 0; i < customers; i++) {
			kb.nextLine();	 
			System.out.print("Enter the name of the stock-->");
			String stockName = kb.nextLine();
			System.out.print("Enter the number of stocks purchased-->");
			int stocksPurchased = kb.nextInt();
			System.out.print("Enter the purchase price of each stock-->");
			double pricePerStock = kb.nextDouble();
			System.out.print("Enter the current price of the stock-->");
			double priceStock = kb.nextDouble();
			System.out.print("Enter the commission rate-->");
			double commissionRate = kb.nextDouble();
			stars();
			double totalBuying = getTotal(pricePerStock,stocksPurchased);
			double totalSelling = getTotal(priceStock,stocksPurchased);
			double sellAmount = priceStock;
			double purchaseAmount = pricePerStock;
			double buyCommission = getCommission(totalBuying,commissionRate);
			double sellCommission = getCommission(totalSelling,commissionRate);
			System.out.println();
			System.out.println("Here is the information about your transaction");
			System.out.println("Stock: " + stockName);
			System.out.println("Number of stocks bought: " + stocksPurchased);
			System.out.println("Purchase price per stock: " + pricePerStock);
			System.out.println("Total commission paid when buying the stock " + buyCommission); 
			System.out.println("Selling price of the stock " + priceStock);
			System.out.println("Total commission paid when selling the stock " + sellCommission);
			System.out.println("The profit you made buying and then selling this stock: " + String.format("%.14f",profit(totalSelling,totalBuying,buyCommission,sellCommission)));
		}
	}

	/*Creates console for user to type info on stock*/
	public static void description()
	{
		for (int q = 0; q <= 160 / 2; q++) {
			System.out.print("_");  
		}
		System.out.println();
		System.out.println("Welcome to stock calculator                                                   ");
		System.out.println("This app calculates the amount of profit you can make when buying and selling stocks");
		System.out.println("Answer a few questions, then you will see the profit you would make");
		stars();
	}
	/*Describes purpose of program*/
	public static void stars()
	{
		for (int i = 1; i <= 82; i++) {
			System.out.print("*");
		}
	}
	/*Prints stars*/
	public static double getTotal(double price, double count)
	{
		return price * count;
	}
	/*Calculates total money spent*/
	public static double getCommission(double price, double rate)
	{
		return price * rate / 100;
	}
	/*Calculates commission cost*/
	public static double profit(double sellAmount, double purchaseAmount, double sellCommission, double buyCommission)
	{

		return sellAmount - purchaseAmount - sellCommission - buyCommission;

	}
	/*Calculates profit/loss*/
}