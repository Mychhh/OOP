package preFinal;

class Student extends Person //subclass
{	
//private variables
	private String program;
	private int yearLevel;

//public methods 	
	public String getProgram() 
	{
		return program;
	}
	public void setProgram(String program) 
	{
		this.program = program;
	}
	
	public int getYearLevel() 
	{
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) 
	{
		this.yearLevel = yearLevel;
	}
}
