package BloodBank;

import java.util.Scanner;

public class RunBloodData {

	public static void main(String[] args) {
		
		BloodData bd = new BloodData();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter blood type of patient      : ");
		String bt = s.nextLine();
	
		System.out.print("Enter the rhesus factor (+ or -) : ");
		String rh = s.nextLine();

//the user doesn't input anything		
		if(bt.isBlank() && rh.isBlank()) 
		{	
//I will set the their bloodType to 0 and rhesusFactor to +
			bd.setbloodType("O");
			bd.setrhFactor ("+");
			System.out.println(bd.getbloodType() + bd.getrhFactor() + " is added to the blood bank.");
		}
//the user input their bloodType and rhesusFactor		
		else 
		{
//the user's bloodType and rhesusFactor will be based on the data that they have input 			
			bd.setbloodType(bt);
			bd.setrhFactor (rh);
			System.out.println(bd.getbloodType() + bd.getrhFactor() + " is added to the blood bank.");
		}		
	}

}
