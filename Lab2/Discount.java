package Lab2;
/*This program will calculate the total amount to pay items */
import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//declaring constant 
	final double DISCOUNTRATE = 0.10;
	//declaring variable
	double itemPrice, discountAmount, finalPrice;
	
	//Ask user to enter the items price
	System.out.println("Please enter your item price (RM) : ");
	itemPrice = sc.nextDouble();
	
	//Calculation to get the final price after applying discount rate
    discountAmount = itemPrice * DISCOUNTRATE;
    finalPrice = itemPrice - discountAmount;
    
	//Display output
    System.out.println("Original price before discount (RM) = " + itemPrice );
    System.out.println("Final price to be paid after applying discount rate (RM) = " + finalPrice );
    
    sc.close();
	}
}
