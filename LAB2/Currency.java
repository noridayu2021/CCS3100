package LAB2;

import java.util.Scanner; //Scanner is in the java.util package
public class Currency {
 public static void main(String[]args) {
	 //Create a Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //Prompt the user to enter the amount 
	 System.out.println("Enter the amount (RM)=");
	 double amount=input.nextDouble();
	 
	 //Compute currencies
	 double USD = amount*0.21;
	 double EURO = amount*0.19;
	 double YEN = amount*33.5;
	 
	 //Display currencies 
	 System.out.println("USD= " + USD);
	 System.out.println("EURO= " + EURO);
	 System.out.println("YEN= " + YEN);
	 
	 input.close();
 }
}
