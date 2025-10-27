package LAB2;

import java.util.Scanner;//Scanner is in the java.util package
public class FuelCost {
 public static void main(String[]args) {
	 
	 //Create a Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //Prompt the user to enter the distace
	 System.out.println("Enter the distance (KM) = ");
	 double distance=input.nextDouble();
	 
	 //Compute the total Fuel cost
	 double totalFuelCost= (distance/100)*6.5*2.1;
	 
	 //Display the total Fuel cost
	 System.out.println(" The total fuel cost is RM"+ totalFuelCost);
	 
	 input.close();
 }
}