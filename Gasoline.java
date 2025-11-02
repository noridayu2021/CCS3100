package Main;
import java.util.Scanner;

public class Gasoline {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total distance: ");
		double A = sc.nextDouble();
		System.out.println("Enter fuel efficiency: ");
		double B = sc.nextDouble();
		System.out.println("Enter price of petrol: ");
		double C = sc.nextDouble();
		
		double D = A / B;
		double E = C * D;
		
		System.out.println("Total Fuel Cost: " + E);
		sc.close();


	}

}
