package Lab2;
/*This program will calculate the total interest and total payment amount*/
import java.util.Scanner;
public class Interest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Declaring constant and variable
	final double INTERESTRATE = 0.04;
	double loanAmount, years, totalInterest, totalPayment;
	
	//User enters the loan amount and the number of the years of repayment
	System.out.println("Please enter your loan amount : ");
	loanAmount = sc.nextDouble();
	System.out.println("Please enter the number of the years : ");
	years = sc.nextDouble();
	
	//Calculate the total interest and total payment amount
	totalInterest = loanAmount * years * INTERESTRATE;
	totalPayment = loanAmount + totalInterest;
	
	//Display output
	System.out.println("The total interest is " + totalInterest + " and the total payment amount is " + totalPayment);
	
	sc.close();
	}
}
