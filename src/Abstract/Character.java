package Abstract;

public abstract class Character implements iPerson
{

	public abstract void walking();
	
	public void showName() 
	{
		System.out.println(name);
	}
	
}
