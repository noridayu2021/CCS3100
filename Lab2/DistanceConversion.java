package Lab2;
/*This program will calculate the total distance and convert the distance from yards to miles, 
 * from miles to kilometers*/
import java.util.Scanner;
public class DistanceConversion {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//declaring variables
	double miles, yards, totalMiles, totalKm;
	int yardsPerMiles = 1760;
	double kmPerMiles = 1.609344;
	
	//User insert the distance in yards and miles
	System.out.println("Please insert distance in yards : ");
	yards = sc.nextDouble();
	System.out.println("Please insert distance in miles");
	miles = sc.nextDouble();
	
	//Convert distance from yards to miles and from miles to kilometers
	totalMiles = miles + (yards/yardsPerMiles);
	totalKm = totalMiles*kmPerMiles;
	
	//Display the output
	System.out.println("The total distance in miles is " + totalMiles + "and the equivalent distance in kilometers is " + totalKm);
	
	sc.close();
	}
}
