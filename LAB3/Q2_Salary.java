package LAB3;
import java.util.Scanner; 
public class Q2_Salary {
	public static void main(String[]args){
	//Create Scanner object
	Scanner input=new Scanner(System.in);
	
	//input
	System.out.println("Enter basic salary= ");// Basic salary
	double basicSalary=input.nextDouble();
	System.out.println("Enter allowance= ");//Allowance
	double allowance=input.nextDouble();
	System.out.println("Enter deduction= ");//Deduction
	double deduction=input.nextDouble();
	
	//Proses
	double grossSalary=basicSalary+allowance;//Gross salary
	double netSalary=grossSalary-(grossSalary*0.08)-deduction;//Net salary
	
	//Display Net Salary
	System.out.println("Net Salary= " + netSalary );
	
	input.close();
	
	}
}
