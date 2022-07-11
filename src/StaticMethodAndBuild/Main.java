package StaticMethodAndBuild;
/*
static	- A non-access modifier used for methods and attributes. 
Static methods/attributes can be accessed without creating an object of a class
*/
public class Main 
{
	//attributes
	static String name = "Michael";
	String surname = "Pabaya";
	
	public static void main(String[] args) 
	{
		methodOne();
	}

	//methods
	static void methodOne () 
	{
		System.out.println("I am static method");
	} 
	
	public void methodTwo () 
	{
		System.out.println("I am public method");
	} 
	
	void methodThree () 
	{
		System.out.println("I am nobody :< ");
	}

}
