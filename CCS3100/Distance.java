
import java.util.Scanner;
public class Distance{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.print("Miles:");
        double miles=input.nextDouble();
        System.out.print("Yards:");
        double yards=input.nextDouble();
        
        //Calculate total miles and total kilometres
        double totalMiles=miles +(yards/1760);
        double totalKilometres=totalMiles*1.609344;
        
        System.out.println("The total miles is:"+totalMiles);//Display total miles
        System.out.print("The total kilometres is:"+totalKilometres);//Display total kilometres
    }
}