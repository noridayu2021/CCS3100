package lab2;

import java.util.Scanner;

public class ques_b {
	
	public static void main (String[]args) {
		
		//constant rate
		final double USDRATE = 0.21, EURORATE = 0.19, YENRATE = 33.5;
		
		//scanner
		Scanner scanner = new Scanner (System.in);
		
		//input
		System.out.print("Enter amount in Malaysian Ringgit:");
		double MalaysianRinggit = scanner.nextDouble();
		
		//process
		double usd = MalaysianRinggit * USDRATE;
		double euro = MalaysianRinggit * EURORATE;
		double yen = MalaysianRinggit * YENRATE;
		
		//output
		System.out.println("----CURRENCY CONVERSION----");
		System.out.println("Amount in Malaysian Ringgit:" + MalaysianRinggit);
		System.out.println("Conversion in USD:" + usd);
		System.out.println("Conversion in EURO:" + euro);
		System.out.println("Conversion in YEN:" + yen);
		
		scanner.close();
	}

}
