package Lab2;
/*This program will ask user to input an amount in MYR to convert into USD, EURO
 * and YEN currencies*/
import java.util.Scanner;

public class MoneyConversion {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//declaring variable
	final double  USD = 0.21, EURO = 0.19, YEN = 33.5;
	double malaysianRinggit, usdAmount, euroAmount, yenAmount;
	
	//User insert the amount in Malaysian Ringgit (MYR)
	System.out.println("Please enter the amount in MYR : ");
	malaysianRinggit = sc.nextDouble();
	
	//Conversion formula
	usdAmount = USD * malaysianRinggit;
	euroAmount = EURO * malaysianRinggit;
	yenAmount = YEN * malaysianRinggit;
	
	//Display the output
	System.out.println("MYR CURRENCY CONVERTER");
	System.out.println("Original amount = " + malaysianRinggit );
	System.out.println("USD = " + usdAmount);
	System.out.println("EURO = " + euroAmount);
	System.out.println("YEN = " + yenAmount);
	
	sc.close();
	}
}
