import java.util.Scanner;
public class FuelCost{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        double FuelCost;
        
        //Read Distance, FuelEfficiency,Price
        System.out.print("Total distance(km):");
        double Distance=input.nextDouble();
        
        System.out.print("Fuel efficiency(km per litre):");
        double FuelEfficiency=input.nextDouble();
        
        System.out.print("Price of petrol(RM per litre):");
        double Price=input.nextDouble();
        
        //Calculate the total fuel cost for the trip
        FuelCost=(Distance/FuelEfficiency)*Price;
        
        //Display the total fuel cost
        System.out.print("The total fuel cost for the trip:RM"+FuelCost);
        
        
    }
}