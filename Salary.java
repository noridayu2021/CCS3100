package Main;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		double A = sc.nextDouble();
		
		System.out.print("Enter allowance: ");
		double B = sc.nextDouble();
		
		System.out.print("Enter deduction: ");
		double C = sc.nextDouble();
		
		double Tax = (A + B) * 0.08;
		double Net = (A + B) - Tax - C;
		
		System.out.println("Net Salary: " + Net );
		sc.close();
	}

}
