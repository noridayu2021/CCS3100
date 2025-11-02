package Main;
import java.util.Scanner;


public class Totalbill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total minute: ");
		double totalminute = input. nextDouble();
		
		System.out.print("Enter total SMS number: ");
		double totalSMSNumber = input. nextDouble();
		
		System.out.print("Enter total Data: ");
		double totalData = input. nextDouble();
		
		int base = 40;
		double A = 0.15;
		double B = 0.10;
		double C = 0.05;
		double D = base + totalminute * A + totalSMSNumber * B + totalData * C ;

		System.out.printf("bill = %.2f", + D);
		
		input.close();

	}
}
