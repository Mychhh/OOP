package BloodBank;

public class BloodData {
	
	private String bloodType;
	private String rhFactor;
	
//setters of bloodTyoe and rhFactor
//setters always has a parameter	
	public void setbloodType(String bloodType) 
	{
		this.bloodType = bloodType;
	}
	
	public void setrhFactor(String rhFactor) 
	{
		this.rhFactor = rhFactor;
	}
	
//getters of bloodType and rhFactor
//getters always has a reserved keyword 'return'
	public String getbloodType()
	{
	return bloodType;	
	}
	
	public String getrhFactor()
	{
	return rhFactor;	
	}

}
 