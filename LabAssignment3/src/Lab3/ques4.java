package Lab3;

import java.util.Scanner;

public class ques4 {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner fuelcalc = new Scanner (System.in);
		
		//input
		System.out.print("Enter Total Distance Traveled (km):");
		double TotalDistance = fuelcalc.nextDouble();
		
		System.out.print("Enter Fuel Efficiency Of The Car (kmperlitre):");
		double FuelEfficiency = fuelcalc.nextDouble();//how far the car travel using 1 litre of petrol
		
		System.out.print("Enter Petrol Price (RMperlitre):");
		double PetrolPrice = fuelcalc.nextDouble();
		
		//process
		double TotalFuelUsed = TotalDistance / FuelEfficiency;//how many petrol needed for the car
		double TotalFuelCost = TotalFuelUsed * PetrolPrice;
		
		//output
		System.out.println("Total Fuel Cost: RM" + TotalFuelCost);
		
		fuelcalc.close();
		
	}
	

}
