package LAB_Assignment2;
import java.util.Scanner;
public class Q2 {
	 public static void main(String[] args) {
		 //declare
		  double entryTime = 0;
	      double rate = 0;
	      double duration = 0;
	      boolean validTime = false;
	      boolean validDuration = false;
	      
        //Create a Scanner object
	    Scanner input = new Scanner(System.in);

	     // Validate entry time
	     while (!validTime) {
	         System.out.println("-------Parking Calculator------");
	         System.out.print("Enter the entry time (24-hour format e.g. 7 or 19): ");
	         entryTime = input.nextDouble();

	            if (entryTime >= 0.00 && entryTime <= 23.59) {
	                validTime = true;
	            } 
	            else {
	                System.out.println("---------------------------------------");
	                System.out.println("Invalid time entered! Please enter a time from 0.00 to 23.59.");
	            }
	        }

	     // Validate duration
	     while (!validDuration) {
	         System.out.print("Enter the duration (hours): ");
	         duration = input.nextDouble();

	            if (duration > 0) {
	                validDuration = true;
	            } 
	            else {
	            	System.out.println("---------------------------------------");
	                System.out.println("Invalid duration! Please enter a positive number.");
	            }
	        }

	     // Determine rate 
	     if (entryTime >= 7 && entryTime < 19) {
	         rate = 3.0;
	         System.out.println("Peak Time");
	        }
	     else if ((entryTime>=0.00 && entryTime<7 ) || (entryTime>=19 && entryTime<23.59)){
	         rate = 1.50;
	         System.out.println("Non-peak Time");
	        }

	        System.out.println("Rate = RM" + rate + "/hour");

	     // Calculate fee
	     double totalFee = rate * duration;

	     if (duration > 12) {
	         double dailyRate = 30;
	         System.out.println("Long-stay detected.");
	         System.out.println("Maximum Parking fee is RM" + dailyRate);
	         System.out.println("Total Fee = RM" + dailyRate);
	        } 
	     else {
	         System.out.println("Total Fee = RM" + totalFee);
	        }

	        input.close();
	    }
	}