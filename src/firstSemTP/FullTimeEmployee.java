package firstSemTP;
//subclass
public class FullTimeEmployee extends Employee{
	
	private double monthSalary;
	
	FullTimeEmployee(String name) {
		super(name);
	}
	
	public void setmonthSalary( double monthSalary) {
		this.monthSalary = monthSalary;
	}
	public double getmonthSalary() {
		return monthSalary;
	}
}