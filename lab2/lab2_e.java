package marathonCalc;

import java.util.Scanner;

public class lab2_e
{
	public static void main(String[] args)
	{
		//constant    
        final double YARDSPERMILE = 1760.0;  
        final double KMPERMILE = 1.609344;
        
        //scanner
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Enter miles distance: ");
		double milesDistance = input.nextDouble();   
		System.out.println("Enter yards distance: ");
		double yardsDistance = input.nextDouble();
        
		//process
        double totalMiles = milesDistance + (yardsDistance/YARDSPERMILE);
        double totalKm = totalMiles * KMPERMILE;
        
        //output
        System.out.println("Total distance in miles: " + totalMiles);
        System.out.println("Equivalent distance in kilometers: " + totalKm);
        
        input.close();
	}
}
