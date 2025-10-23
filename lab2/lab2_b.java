package moneyChanger;

import java.util.Scanner;

public class lab2_b
{
	public static void main(String[] args)
	{
		//constant
		final double USDRATE = 0.21;
		final double EURORATE = 0.19;
		final double YENRATE = 33.5;
		
		//scanner
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Enter MYR amount: ");
		double amountMyr = input.nextDouble();
		
		//process
		double amountUsd = amountMyr * USDRATE;
        double amountEuro = amountMyr * EURORATE;
        double amountYen = amountMyr * YENRATE;
        
        //output
        System.out.println("Converted amounts:");
        System.out.println("USD: " + amountUsd);
        System.out.println("EURO: " + amountEuro);
        System.out.println("YEN: " + amountYen);
        
        input.close();
	}
}
