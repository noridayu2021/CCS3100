package lab2;

import java.util.Scanner;

public class ques_a {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.print("Enter amount purchase (RM):");
		double AmountPurchase = scanner.nextDouble();
		double DiscountRate = 0.10;
		
		//process
		double DiscountAmount = AmountPurchase * DiscountRate;
		double PriceAfterDiscount = AmountPurchase - DiscountAmount;
		
		//output
		System.out.println("----RECEIPT----");
		System.out.println("Original Price: RM" + AmountPurchase);
		System.out.println("Discount: RM" + DiscountAmount);
		System.out.println("Price After Discount: RM" + PriceAfterDiscount);
		
		scanner.close();
	}

}
