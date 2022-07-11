package firstSemTP;
//this is main class
import java.util.Scanner;

public class RunEmployee {

	public static void main(String[] args) {
				
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name =  s.nextLine();
		
		FullTimeEmployee FE = new FullTimeEmployee(name);
		PartTimeEmployee PE = new PartTimeEmployee(name);
		
		FE.setName(name);
		PE.setName(name);
		
		System.out.println("Press F for Full Time or P for Part Time");
		char FP = s.next().charAt(0);
		
		if (FP == 'F') 
		{
			System.out.println("Please type your monthly Salary : ");
			double salary = s.nextDouble();
			
			FE.setmonthSalary(salary);
			
			System.out.println("Name : " + FE.getName());
			System.out.println("Monthly Salary : " + FE.getmonthSalary());
			
		}
		else if(FP == 'P')
		{
			System.out.println("Enter rate per hour and no. of hours worked separated by space : ");
			double rph = s.nextDouble();
			int hw = s.nextInt();
			
			PE.setRatePerHour(rph);
			PE.setHoursWorked(hw);
			
			System.out.println("Name : " + PE.getName());
			System.out.printf("Wage : %.2f", PE.getwage());
			
		}
		else 
		{
			System.out.println("Invalid Letter!");
		}

	}
}