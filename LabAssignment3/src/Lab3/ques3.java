package Lab3;

import java.util.Scanner;

public class ques3 {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner bmicalc = new Scanner (System.in);
		
		//input
		System.out.print("Enter your weight (kg): ");
		double weight = bmicalc.nextDouble();
		
		System.out.print("Enter your height (m): ");
		double height = bmicalc.nextDouble();
		
		System.out.print("Enter your age: ");
		double age = bmicalc.nextDouble();
		
		//process
		double bmi = weight / (height*height);
		double bodyfat = (1.20*bmi) + (0.23*age) - 5.4;
		
		//output
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your body fat percentage is " + bodyfat);
		
		bmicalc.close();
		
	}

}
