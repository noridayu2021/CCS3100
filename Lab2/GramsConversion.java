package Lab2;
/*This program will convert the amount of flour from gram to kilogram and pound*/
import java.util.Scanner;
public class GramsConversion {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//declaring variables
	double grams, flourKg, flourPounds;
	final double GRAMSPERKG = 1000, KGPERPOUNDS = 2.20462;
	
	//Enter the required weight of flour
	System.out.println("Please enter the grams of the flour : ");
	grams = sc.nextDouble();

	//Conversion from grams to kg and pounds
	flourKg = grams / GRAMSPERKG;
	flourPounds = flourKg * KGPERPOUNDS;
	
	//Display output
	System.out.println("The original amount is (g) " + grams  );
	System.out.println("Convert the amount to kilograms (kg) : " + flourKg  );
	System.out.println("Convert the amount to pounds (lb) " + flourPounds  );
	
	sc.close();
	}
}
