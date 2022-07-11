package activityTwo;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int num;
		int mnum;
		
		Scanner s = new Scanner(System.in);
		System.out.println("          This is Exponential Calculator");
		System.out.println();
		System.out.print("Enter Number          : ");
		num = s.nextInt();
		System.out.print("Multiply me to myself : ");
		mnum = s.nextInt();
	
		int result = 0;
		
//One way selection using if statement inside a for loop
		for (int i = 1; i < mnum; i++) {
			int cnum = num;
			
			if (cnum < result) {//if the cnum is less than the result	
				cnum = result; 	//the value of cnum will change in to the value of result	
			}
			
			result = cnum * num;
		}
		System.out.println();
		System.out.println("The answer is         : " + result);
	}
}