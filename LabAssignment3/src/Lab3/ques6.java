package Lab3;

import java.util.Scanner;

public class ques6 {
	
	public static void main (String[]args) {
		
		//constant
		final double BASECHARGE=40, CALLRATE=0.15, SMSRATE=0.10, DATARATE=0.05;
	
		//scanner
		Scanner billcalc = new Scanner(System.in);
		
		//input
		System.out.print("Enter the call duration (minutes): ");
		double Call = billcalc.nextDouble();
		
		System.out.print("Enter the number of SMS: ");
		double Sms = billcalc.nextDouble();
		
		System.out.print("Enter the mobile data used (MB): ");
		double Data = billcalc.nextDouble();
		
		//process
		double TotalBill = BASECHARGE + (Call*CALLRATE) + (Sms*SMSRATE) + (Data*DATARATE);
		
		//output
		System.out.println("The total bill for the month: RM" + TotalBill);
		
		billcalc.close();
	}

}
