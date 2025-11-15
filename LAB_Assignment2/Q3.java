package LAB_Assignment2;
import java.util.Scanner;
public class Q3 {
  public static void main(String[]args) {
	  
	  // declare
	     int category = 0;
	     int carType = 0;
	     boolean validCategory = true;
	     boolean validCarType = true;

	   // Create a Scanner object
	     Scanner input = new Scanner(System.in);

	   // input from user
	     while (validCategory) {
	         System.out.println("------Langkawai SkyCab ticket counter------");
	         System.out.print("Choose your category (1-3)= ");
	         category = input.nextInt();

	         if (category>=1 && category<=3) 
	              validCategory = false;
	             else {
	                System.out.println("Invalid category entered!");
	            }
	        }
	     while (validCarType) {
	         System.out.print("Choose your car type (1/2)= ");
	         carType = input.nextInt();

	            if (carType>=1 && carType<=2) 
	                validCarType = false;
	             else {
	                System.out.println("---------------------------------------");
	                System.out.println("Invalid car type entered!");
	            }

	        }

	     // determine the categories and car type using switch statement
	        switch (category) {
	            case 1:
	                System.out.println("Adult");
	                break;

	            case 2:
	                System.out.println("Child (3-12)");
	                break;

	            case 3:
	                System.out.println("Senior Citizen (60+)");
	                break;
	            default:

	        }

	        switch (carType) {
	            case 1:
	                System.out.println("Normal Gondola");
	                break;

	            case 2:
	                System.out.println("Glass-Bottom Gondola");
	                break;
	            default:
	        }

	        // price for car type
	        if (category == 1) {
	            if (carType == 1) 
	                System.out.println("RM 55");
	            else {
	                System.out.println("RM 85");
	            }
	        }
	        if (category == 2) {
	            if (carType == 1) 
	                System.out.println("RM 40");
	            else {
	                System.out.println("RM 65");
	            }
	        }
	        if (category == 3) {
	            if (carType == 1) 
	                System.out.println("RM 45");
	            else {
	                System.out.println("RM 70");
	                System.out.println("Enjoy your Sky View Experience, Senior!");
	            }
	        }
	        
	        input.close();
	    

	

  }
}
