package Lab2;
/*This program will calculate the total fuel for the trip*/
import java.util.Scanner;
public class FuelCost {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//declaring variables
	double distance, neededFuel, totalCost;
	final double FUELCONSUMPTION = 6.5, FUELCOST = 2.10; 
	
	//User enter the travel distance
	System.out.println("Please enter your travel distance : ");
	distance = sc.nextDouble();
	
	//Calculate the fuel cost for the trip
	neededFuel = (distance * FUELCONSUMPTION)/100;
	totalCost = neededFuel * FUELCOST;
	
	//Display output
	System.out.println("The total fuel cost for the trip is " + totalCost);
	
	sc.close();
	}
}
