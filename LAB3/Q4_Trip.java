package LAB3;
import java.util.Scanner;
public class Q4_Trip {
 public static void main(String[]args) {
	 //Create a Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //Input
	 System.out.println("Enter the total distance(km)= ");//Total distance 
	 double distance=input.nextDouble();
	 System.out.println("Enter the fuel efficiency(km per litre)= ");//Fuel efficiency
	 double fuelEfficiency=input.nextDouble();
	 System.out.println("Enter the price of petrol(RM per litre)= ");//Price of petrol
	 double petrolPrice=input.nextDouble();
	 
	 //Proses
	 double totalFuelCost=(distance/fuelEfficiency)*petrolPrice;//Calculate the total fuel cost
	 
	 //Display the total fuel cost
	 System.out.println(" The total fuel cost is= " + totalFuelCost);
	 
	 input.close();
	 
	 

 }
}
