package activityTwo;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		
		int num;
		int mnum;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number          : ");
		num = s.nextInt();
		System.out.print("Multiply me to myself : ");
		mnum = s.nextInt();
	
		int result = num * num;

		for (int i = 1; i < mnum; i++) {
			System.out.println(result);
			result = result * num;
		}
		//System.out.println("The answer is         : " + result);
		
		System.out.println();
		
        int total = num * num;
		int x = 1;
		
		while (x < mnum ) {
			System.out.println(total);
			total = total * num;
			x++;
		}	

	}

}
