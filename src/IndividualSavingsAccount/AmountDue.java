package IndividualSavingsAccount;

public class AmountDue {
	
    void computeAmountDue(int price)
	{
    	int tax = 12;
    	
    	int total = price / tax;
    	double totalDue = price + total;
    	System.out.println("Amount due is : " + totalDue);	
	}
    void computeAmountDue(int price, int quantity)
	{
    	price = price * quantity; 
    	computeAmountDue(price);	
	}
    void computeAmountDue(int price, int quantity, int discountAmount)
   	{
    	double tax = 0.12;
    	
    	int compute = (price * quantity) - discountAmount;
    	double total = price * tax;
    	double totalDue = compute + total;
    	System.out.println("Amount due is : " + totalDue);	
   	}

}
