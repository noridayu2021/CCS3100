package LAB2;

import java.util.Scanner;//Scanner is in the java.util package
public class Interest {
 public static void main (String[]args) {
	 
	 //Create a Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //Prompt the user to enter the loanAmount and years
	 System.out.println(" Enter loan amount= ");
	 double loanAmount=input.nextDouble();
	 System.out.println(" Enter number of years=");
	 double Years=input.nextDouble();
	 
	 //Compute total Interest and total Payment
	 double totalInterest= loanAmount*0.4*Years;
	 double totalPayment= loanAmount+totalInterest;
	 
	 //Display the total Interest and total Payment
	 System.out.println("Total interest is "+ totalInterest );
	 System.out.println("Total Payment is "+ totalPayment );
	 
	 input.close();
	 
 }
}
