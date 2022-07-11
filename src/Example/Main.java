package Example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		     int numb8 = 0;
		     int numb9 = 0;
		     
		 Scanner cutie = new Scanner(System.in);
		      
		 System.out.print("Enter the number: ");
		       numb8 = cutie.nextInt();
		       
		 System.out.print("Multiply me to myself and times: ");
		       numb9 = cutie.nextInt();
		 System.out.print("the answer is the: ");
		  
		 System.out.println((int) Math.pow(numb8 ,numb9));
		    

	}


}
