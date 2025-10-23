package onlineStore;

import java.util.Scanner;

public class lab2_a
{
	 public static void main(String[] args)
	 {
		 //constant
		 final double DISCOUNTRATE = 0.10; 
		 
		 //scanner
		 Scanner input = new Scanner(System.in);

		 //input
		 System.out.print("Enter item price (RM): ");
	     double oriAmount = input.nextDouble();     
	     
	     //process
	     double newAmount = oriAmount * (1 - DISCOUNTRATE);
	        
	     //output
	     System.out.println("Original amount: RM" + oriAmount);
	     System.out.println("Amount after discount: RM" + newAmount);
	     
	     input.close();
	 }
}
