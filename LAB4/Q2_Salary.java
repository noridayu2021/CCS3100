package LAB4;
import java.util.Scanner;
public class Q2_Salary {
	public static void main(String[]args){
		//Create Scanner object
		Scanner input=new Scanner(System.in);
		
		//declare
		double tax;
		double grossSalary=0.0;
		
		//input
		System.out.println("====Salary Calculator====");
		System.out.print("Enter basic salary=RM");// Basic salary
		double basicSalary=input.nextDouble();
		System.out.print("Enter allowance=RM");//Allowance
		double allowance=input.nextDouble();
		System.out.print("Enter deduction=RM");//Deduction
		double deduction=input.nextDouble();
	
		//if-else statement
		
	    if (grossSalary<=3000) 
	    	tax=0;
	
	    else 
	    	tax=0.08;
	    
		
		//Proses
		double grossSalary1=basicSalary+allowance;//Gross salary
		double netSalary=grossSalary1-(grossSalary1*tax)-deduction;//Net salary
		
		//Display Net Salary
		System.out.println("Net Salary=RM " + netSalary );
		
		input.close();
		
		}
	}




