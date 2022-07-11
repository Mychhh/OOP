package IndividualSavingsAccount;

import java.util.Scanner;

public class RunAmountDue {

	public static void main(String[] args) {
		
		AmountDue ad = new AmountDue();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Press any of the following then enter values separated by spaces : ");
		System.out.println("1 - Price only");
		System.out.println("2 - Price and Quantity");
		System.out.println("3 - Price, Quantity, and Discount amount");
		int num = s.nextInt();
		
		 if(num == 1) 
		 {
			int price = s.nextInt();
			ad.computeAmountDue(price);
		 }
		 else if(num == 2) 
		 {
			int price = s.nextInt();
			int quantity = s.nextInt();
			ad.computeAmountDue(price, quantity); 
		 }		
		 else if(num == 3)
		 {
			int price = s.nextInt();
			int quantity = s.nextInt();
			int discountAmount = s.nextInt();
			ad.computeAmountDue(price, quantity, discountAmount);
		 }
		
	}

}
