package fuelCalc;

import java.util.Scanner;

public class lab2_d
{
	public static void main(String[] args)
	{
		//constants
		final double FUELPRICE = 2.10;
		final double FUELAMOUNT = 6.5;
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Enter the road distance (km): ");
		double distance = input.nextDouble();

		//process
		double fuelNeeded = FUELAMOUNT*(distance/100);
		double totalFuelCost = fuelNeeded*FUELPRICE;
		
		//output
		System.out.println("Distance: " + distance + " km");
        System.out.println("Fuel needed: " + fuelNeeded + " liters");
        System.out.println("Total fuel cost: RM" + totalFuelCost);
        
        input.close();
	}
}
