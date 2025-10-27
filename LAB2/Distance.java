package LAB2;

import java.util.Scanner;//Scanner is in the java.util package
public class Distance {
  public static void main (String[]args) {
	  
	  //Create a Scanner object
	  Scanner input=new Scanner (System.in);
	  
	  //Prompt the user to enter the distance
	  System.out.println(" Enter the distance in miles= ");
	  double miles=input.nextDouble();
	  System.out.println(" Enter the distance in yards= ");
	  double yards=input.nextDouble();
	  
	  //Compute the total distance 
	  double totalMiles= miles+(yards/1760);
	  double totalKilometers= totalMiles*1.609344;
	  
	  //Display the total distance
	  System.out.println(" The total distance in Miles is "+ totalMiles );
	  System.out.println(" The total distance in Kilometers is "+ totalKilometers);
	  
	  input.close();
	  
  }
}
