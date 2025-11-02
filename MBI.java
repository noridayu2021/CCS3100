package Main;
import java.util.Scanner;

public class MBI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight: ");
		double A = sc.nextDouble();
		
		System.out.print("Enter Height: ");
		double B = sc.nextDouble();
				
		System.out.print("Enter Age: ");
		double C = sc.nextDouble()	;	
		
		double D = A / (B * C);
		double E = (1.20 * D) + (0.23 * C);
		
		System.out.println("MBI: "+ D + "Body fat: " + E + "%");
		sc.close();
	}

}
