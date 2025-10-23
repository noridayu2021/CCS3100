package flourCalc;

import java.util.Scanner;

class lab2_f
{
	public static void main(String[] args)
	{
		//constant
        final double GRAMPERKG = 1000.0;  
        final double POUNDPERKG = 2.20462; 
        
        //scanner
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Enter flour weight in gram: ");
		double flourGram = input.nextDouble();
		    
		//process
        double flourKg = flourGram / GRAMPERKG;
        double flourPound = flourKg * POUNDPERKG;
        
        //output
        System.out.println("Original amount: " + flourGram + " g");
        System.out.println("Converted to kilograms: " + flourKg + " kg");
        System.out.println("Converted to pounds: " + flourPound + " lbs");
        
        input.close();
	}
}
