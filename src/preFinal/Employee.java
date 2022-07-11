package preFinal;

class Employee extends Person //subclass
{
//private variables
	private double salary;
	private String department;
		
//public methods 	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
		
	public String getDepartment() 
	{
		return department;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}
}
