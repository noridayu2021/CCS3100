package LAB3;
import java.util.Scanner;
public class Q6_Bill {
 public static void main(String[]args) {
	
	 
	 //Constant for billing rates 
	 final double baseCharge= 40;
	 final double callRate= 0.15;
	 final double SMSrate=0.10;
	 final double dataRate= 0.05;
	 
	 //Create a Scanner object
	 Scanner input=new Scanner (System.in);
	 
	 //Input 
	 System.out.println("Enter your monthly usage below");
	 System.out.println(" Call minutes= ");//Call duration
	 double minutes=input.nextDouble();
	 System.out.println(" Number of SMS= ");//Number of SMS
	 double SMS=input.nextDouble();
	 System.out.println(" Mobile Data (MB)= ");//Usage of mobile data
	 double data=input.nextDouble();
	 
	 //Proses 
	 double callCharges= minutes*callRate;//Call charges
	 double SMScharges=SMS*SMSrate;//SMS charges 
	 double dataCharges=data*dataRate;//Mobile data charges
	 double totalBill=baseCharge+callCharges+SMScharges+dataCharges;//Total bill
	 
	 //Display bill 
	 System.out.println("Total bill= " + totalBill);
	 
	 input.close();
	 
	 
 }
}
