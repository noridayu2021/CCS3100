package lab2;

import java.util.Scanner;

public class ques_f {
	
	public static void main (String[]args) {
		
		//constant
		final double GRAMPERKG = 1000, POUNDPERKG = 2.20462;
		
		//scanner
		Scanner scanner = new Scanner (System.in);
		
		//input
		System.out.print("Enter Flour Amount in gram:");
		double Grams = scanner.nextDouble();
		
		//process
		double TotalKg = Grams / GRAMPERKG;
		double TotalPound = TotalKg * POUNDPERKG;
		
		//output
		System.out.println("---CAKE FLOUR CONVERSION---");
		System.out.println("Original value of flour:" + Grams + "gram");
		System.out.println("Value converted to kilogram:" + TotalKg + "kg");
		System.out.println("Value converted to pound:" + TotalPound + "pound");
		
		scanner.close();
		
	}

}
