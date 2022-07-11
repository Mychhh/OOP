package firstSemTP;
//subclass
public class PartTimeEmployee extends Employee{

	private double ratePerHour;
	private int hoursWorked;
	private double wage;
	
	PartTimeEmployee(String name) {
		super(name);
	}
	
	public void setwage(double wage) {
		this.wage = wage;
	}
	public double getwage() {
		wage = ratePerHour * hoursWorked;
		return wage;
	}
	
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}