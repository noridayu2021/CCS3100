
import java.util.Scanner;
public class FuelCost{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter distance travel from Kuala Lumpur to Penang(km):");
        double distance=input.nextDouble();
        
        double totalFuelCost=((distance/100)*6.5)*2.1;//Calculate the total fuel cost
        
        System.out.print("The total fuel cost is RM"+totalFuelCost);//Display total fuel cost
    }
}