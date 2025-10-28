package lab2;

import java.util.Scanner;

public class ques_d {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner scanner = new Scanner (System.in);
		
		//input
		System.out.print("Enter distance traveled (km):");
		double Distance = scanner.nextDouble();
		System.out.print("Enter fuel used (litre):"); //every 100km
		double FuelUsed = scanner.nextDouble();
		System.out.print("Enter fuel price per litre (RM):");
		double FuelPrice = scanner.nextDouble();
		
		//process
		double TotalFuelUsed = (Distance/100) * FuelUsed;
		double TotalFuelCost = TotalFuelUsed * FuelPrice;
		
		//output
		System.out.println("---TRIP FUEL COST---");
		System.out.println("Distance Traveled:" + Distance + "km");
		System.out.println("Fuel Used:" + FuelUsed + "litre");
		System.out.println("Fuel Price: RM" + FuelPrice );
		System.out.println("Total Fuel Used:" + TotalFuelUsed + "litre/km");
		System.out.println("Total Fuel Cost:" + TotalFuelCost);
		
		scanner.close();
		
	}

}
