package Labs;
/*
1.Jordan Penaloza
2. 7/6/2022
3. This program designs a payroll class to have instance variables of an employee's information
4. I give myself a 100% because I met every requirement in the rubric to get a 100%.
 */
public class PayrollPenaloza
{
}
class Payroll
{
	//initializes variable instances
	private String name;
	private String ID;
	private double hourlyRate;
	private double hoursWorked;

	public Payroll (String n, String I, double rate, double hours) {
		//sets variables as parameters
		super();
		name = n;
		ID = I;
		hourlyRate = rate;
		hoursWorked = hours;
		//methods used to be called later
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public void setID(String newID)
	{
		ID = newID;
	}
	public void sethourlyRate(double newhourlyRate)
	{
		hourlyRate = newhourlyRate;
	}
	public void sethoursWorked(double newhoursWorked)
	{
		hoursWorked = newhoursWorked;		
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public double getRate()
	{
		return hourlyRate;
	}
	public double hoursWorked()
	{
		return hoursWorked;
	}
	public String toString()
	{
		return "Name : "+this.getName()+"\n"+"ID : "+this.getID()+"\n"+"Hourly Rate : "+this.getRate()+"\n"+"Hours Worked :"
				+this.hoursWorked()+"\n"+"Pay : " +this.Pay();

	}
	public double Pay()
	{
		return this.hoursWorked*this.hourlyRate;
	}

}
class PayrollDriver
{
	public static void main(String[] args)
	{
		Payroll p1 = new Payroll("1234","Alex",12,12);
		Payroll p2 = new Payroll("9807", "Nik",10,20);
		Payroll p3 = new Payroll("2345","Jose", 100, 20);

		//calls the method toString to display the information for the object p1, p2, p3
		System.out.println("Testing the toString method\n");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		//displays info about object p1
		System.out.println("testing the getter methods and the pay method\n");
		System.out.println("Information for getter methods of p1..");
		System.out.println("Name : "+p1.getName());
		System.out.println("Id : "+p1.getID());
		System.out.println("Hours Worked :"+p1.hoursWorked());
		System.out.println("Hour Rate : "+p1.getRate());
		System.out.println("Pay : "+p1.Pay());

		//displays info about object p2
		System.out.println("Information for getter methods of p2..");
		System.out.println("Name : "+p2.getName());
		System.out.println("Id : "+p2.getID());
		System.out.println("Hours Worked :"+p2.hoursWorked());
		System.out.println("Hour Rate : "+p2.getRate());
		System.out.println("Pay : "+p2.Pay());

		//displays info about object p3
		System.out.println("Information for getter methods of p3..");
		System.out.println("Name : "+p3.getName());
		System.out.println("Id : "+p3.getID());
		System.out.println("Hours Worked :"+p3.hoursWorked());
		System.out.println("Hour Rate : "+p3.getRate());
		System.out.println("Pay : "+p3.Pay());

		//tests the setter method
		System.out.println("testing the setter methods\n");
		System.out.println("setting the hours worked for Alex to 25");
		p1.sethoursWorked(25);
		System.out.println(p1.toString());
		System.out.println("Name and Pay for p1..");
		System.out.println("Name : "+p1.getName());
		System.out.println("Pay : "+p1.Pay());

		System.out.println("Name and Pay for p2..");
		System.out.println("Name : "+p2.getName());
		System.out.println("Pay : "+p2.Pay());

		System.out.println("Name and Pay for p3..");
		System.out.println("Name : "+p3.getName());
		System.out.println("Pay : "+p3.Pay());
		System.out.println("setting the hourly rate for Nikto 45");
		p2.sethourlyRate(45);
		System.out.print(p2.toString());    		 
		System.out.println(p2.getName());
		System.out.println(p2.Pay());
	}
}
