package LAB4;
import java.util.Scanner;
public class Q4_Trip {
 

  public static void main(String[]args) {
	  //Create a Scanner object 
	  Scanner input=new Scanner (System.in);
	  
	  //declare 
	  double km=0.0;
	  double fuelEfficiency;
	  double petrolPrice;
	  double fuelCost=0.0,totalFuelCost=0.0;
	  double fuelRequired;
	  
	  
	  //Create a loop 
	  for (int i=1 ;i<3; i++) {
	     System.out.println(" --Trip "+ i +"--" );
	     System.out.print("Enter the Total distance(km)= ");
	     km=input.nextDouble();
	     System.out.print("Enter the fuel efficiency (km per litre)= ");
	     fuelEfficiency=input.nextDouble();
	     System.out.print("Enter the Price of petrol ( RM per litre) ");
	     petrolPrice=input.nextDouble();
	  
	 
	    if (km>400) {
	    	 System.out.println("Long-distance trip! Check your car!");
	     }
	     
	    
	    //Calculate fuel required and fuel cost
		  fuelRequired=km/fuelEfficiency;
		  System.out.println("Fuel required for trip " +i+": "+ fuelRequired+" litre");
		  fuelCost=fuelRequired*petrolPrice;
		  System.out.println("Fuel cost for trip "+i+": RM"+ fuelCost);
		 
	  
	    //Calculation for total fuel cost
	       totalFuelCost+=fuelCost;
	 }
	    //Display total Fuel Cost 
	       System.out.println("================================");
	       System.out.println(" Total fuel cost for all trip is= RM"+ totalFuelCost);
	       System.out.println("================================");
	  
	    input.close();
	  
	  
			  
  }
}


