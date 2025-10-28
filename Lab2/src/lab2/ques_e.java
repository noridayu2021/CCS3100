package lab2;

import java.util.Scanner;

public class ques_e {
	
	public static void main (String[]args) {
		
		//constant
		final double YARDSPERMILES = 1760, KMPERMILES = 1.609344;
		
		//scanner
		Scanner scanner = new Scanner (System.in);
		
		//input
		System.out.print("Enter total distance covered in miles:");
		double Miles = scanner.nextDouble();
		System.out.print("Enter total distance covered in yards:");
		double Yards = scanner.nextDouble();
		
		//process
		double TotalMiles = Miles + (Yards / YARDSPERMILES);
		double TotalKm = TotalMiles * KMPERMILES;
		
		//output
		System.out.println("---MARATHON DISTANCE CALCULATOR---");
		System.out.println("Total Distance Covered:" + Miles + "miles" + Yards + "yards");
		System.out.println("Total Distance Converted to Miles:" + TotalMiles + "miles");
		System.out.println("Total Distance Converted to Km:" + TotalKm + "km");
		
		scanner.close();
		
		
	}

}
