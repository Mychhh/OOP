package preFinal;

import java.util.Scanner;

public class CollegeList 
{

	public static void main(String[] args) 
	{
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("Press \nE for Employee : \nF for Faculty  : \nS for Student  : ");
	System.out.print("-> ");
	String EFS = s.nextLine();
	
	if(EFS.equalsIgnoreCase("e")) 
	{
		Employee e = new Employee();
		
		System.out.println("\nType Employee's Name, Contact Number, Salary, and Department. \nPress enter every input.\n");
	    
		String name = s.nextLine();
		String contactNum = s.nextLine();
		double salary = s.nextDouble();
		s.nextLine();
		String department = s.nextLine();
		
		System.out.println("\n------------------------------------\n");
		
		e.setName(name);
		e.setContactNum(contactNum);
		e.setSalary(salary);
		e.setDepartment(department);
		
		System.out.println("Name           : " + e.getName());
		System.out.println("Contact Number : " + e.getContactNum());
		System.out.println("Salary         : " + e.getSalary());
		System.out.println("Department     : " + e.getDepartment());		
		
	}
	else if(EFS.equalsIgnoreCase("f")) 
	{
		Faculty f = new Faculty();
		
		System.out.println("\nPress Y if the regular member is Regular/Tenured or N if not.");
		System.out.print("->");
		String yn = s.nextLine();
		
		if(yn.equalsIgnoreCase("y"))
		{
			f.setStatus(true);
		}
		else if(yn.equalsIgnoreCase("n"))
		{
			f.setStatus(false);
		}
		else 
		{
			System.out.println("Invalid Answer!");
		}
		
		System.out.println("\nType employee's Name, Contact Number, Salary, and Department. \nPress enter every input.\n");
	    
		String name = s.nextLine();
		String contactNum = s.nextLine();
		double salary = s.nextDouble();
		s.nextLine();
		String department = s.nextLine();
		
		System.out.println("\n------------------------------------\n");
		
		f.setName(name);
		f.setContactNum(contactNum);
		f.setSalary(salary);
		f.setDepartment(department);
		
		System.out.println("Name           : " + f.getName());
		System.out.println("Contact Number : " + f.getContactNum());
		System.out.println("Salary         : " + f.getSalary());
		System.out.println("Department     : " + f.getDepartment());
		System.out.println("Status Regular : " + f.isStatus());
	}
	else if(EFS.equalsIgnoreCase("s")) 
	{
		Student st = new Student();
		System.out.println("\nType Student's Name, Contact Number, Enrolled Program, and Year Level. \nPress enter every input.\n");
	    
		String name = s.nextLine();
		String contactNum = s.nextLine();
		String program = s.nextLine();
		int yearLevel = s.nextInt();
		
		System.out.println("\n------------------------------------\n");
		
		st.setName(name);
		st.setContactNum(contactNum);
		st.setProgram(program);
		st.setYearLevel(yearLevel);
		
		System.out.println("Name             : " + st.getName());
		System.out.println("Contact Number   : " + st.getContactNum());
		System.out.println("Enrolled Program : " + st.getProgram());
		System.out.println("Year Level       : " + st.getYearLevel());		
		
	}
	else 
	{
		System.out.println("Invalid Answer!");
	}

	}
/*
Michael Pabaya
09657107290
20200.75
IT Department 
 */
}