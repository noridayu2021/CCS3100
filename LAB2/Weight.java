package LAB2;

import java.util.Scanner;//Scanner is in thr java.util package
public class Weight {
 public static void main(String[]args) {
	 
	 //Create a Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //Prompt the user to enter the weight 
	 System.out.println(" Enter the weight of flour in grams = ");
	 double grams=input.nextDouble();
	 
	 //Convert the weight to kilograms and pound
	 double kilograms = grams /1000;
	 double pound = kilograms *2.20462;
	 
	 //Display the weight
	 System.out.println("The weight of flour in grams is "+ grams );
	 System.out.println("The weight of flour in kilograms is "+ kilograms );
	 System.out.println("The weight of flour in pounds is "+ pound );
	 
	 input.close();
	 
 }
}
