package loanCalc;

import java.util.Scanner;

public class lab2_c
{
	public static void main(String[] args)
	{
		//constant
		final double INTERESTRATE=0.04;
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Enter principal amount: RM");
		double principal = input.nextDouble();
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
		//process
		double totalInterest = principal*INTERESTRATE*years;
		double totalPayment = principal+totalInterest;
		
		//output
		System.out.println("Total interest: RM " + totalInterest);
        System.out.println("Total payment: RM " + totalPayment);
        
        input.close();
	}	
}
