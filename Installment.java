package Main;
import java.util.Scanner;

public class Installment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter phone price: ");
		double A  = sc.nextDouble();
		System.out.print("Enter deposit paid: ");
		double B  = sc.nextDouble();
		System.out.print("Enter monthly interest rate: ");
		double C  = sc.nextDouble();
		
		double D = A - C;
		double E = D * (C / 100) * 12;
		double F = E + D;
		double G = F / 12;
		
		System.out.println("Total Amount Payable" + F +
				"Monthly installment" + G);
		
		sc.close();
	
	
	}

}
