package Lab3;

import java.util.Scanner;

public class ques2 {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner payroll = new Scanner (System.in);
		
		//input
		System.out.print("Enter amount of basic salary: RM");
		double BasicSalary = payroll.nextDouble();
		
		System.out.print("Enter amount of allowance: RM");
		double Allowance = payroll.nextDouble();
		
		System.out.print("Enter amount of deduction such as EPF, loan, etc: RM");
		double Deduction =payroll.nextDouble();
		
		double Tax = 0.08;
		
		//process
		double GrossSalary = BasicSalary + Allowance;
		double TaxImpose = Tax * GrossSalary;
		double NetSalary = GrossSalary - TaxImpose - Deduction;
		
		//output
		System.out.println("Net Salary: RM" + NetSalary) ;
		
		payroll.close();
	}

}
