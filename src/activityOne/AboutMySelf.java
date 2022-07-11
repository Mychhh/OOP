package activityOne;
import java.util.Scanner;
public class AboutMySelf {

	public static void main(String[] args) {
		//Calling class
		MyDetails MD = new MyDetails();
		MySiblings MS = new MySiblings();
		
		Scanner s = new Scanner(System.in);
		System.out.println("    Hello, do you want to know me?");
		System.out.println(" ------------------------------------ ");
		System.out.println("|Type : UwU  (If YES) | Krazy (If NO)|");
		System.out.println(" ------------------------------------ ");
		System.out.print("               ");
		String ans = s.nextLine();
		
		if(ans.equalsIgnoreCase("UwU")) {
			MD.Personalities();
			MS.MyBrothers();   //Calling Methods
			MS.MySister();
		}
		else if(ans.equalsIgnoreCase("Krazy")) System.out.println("Edi don't");
		else System.out.println("Invalid Answer");
		/*I only use one line of code in else if and else condition.   
		  That is why I didn't use curly braces, to lessen the line of codes */
	}

}