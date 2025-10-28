package lab2;

import java.util.Scanner;

public class ques_c {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.print("Enter loan amount: RM");
		double Principal = scanner.nextDouble();
		
		System.out.print("Enter number of years:");
		double Years = scanner.nextDouble();
		
		double LoanRate = 0.04;
		
		//process
		double Interest = Principal * LoanRate * Years;
		double TotalPayment = Principal + Interest;
		
		//output
		System.out.println("----LOAN DETAILS----");
		System.out.println("Loan amount: RM" + Principal);
		System.out.println("Total interest: RM" + Interest);
		System.out.println("Total Payment: RM" + TotalPayment);
		
		scanner.close();
	}

}
