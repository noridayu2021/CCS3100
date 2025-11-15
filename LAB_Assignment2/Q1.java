package LAB_Assignment2;
import java.util.Scanner;
public class Q1 {
	 public static void main(String[] args) {
	      // declare
	      int code=0;
	      int totalPrice = 0;

	      // Create A Scanner object
	      Scanner input = new Scanner(System.in);

	      // Constants
	      final int silverPrice = 12000;
	      final int goldPrice = 18000;
	      final int platinumPrice = 25000;
	      final int liveBand = 2000;
	      final int photoBooth = 1000;
	      boolean validCode=false;

	      // Display menu
	      while(!validCode) {
	      System.out.println("------Wedding hall Package------");
	      System.out.println("Choose your package:");
	      System.out.println("1. Silver Package (up to 300 pax) -RM12,000");
	      System.out.println("2. Gold Package (up to 500 pax) -RM18,000");
	      System.out.println("3. Platinum Package (up to 800 pax) -RM25,000");
	      System.out.println("===============================================");
	      System.out.print("Enter Package code (1-3)= ");
	      code = input.nextInt();
	      
	      if(code>=1 && code<=3 ) 
	    	  validCode=true;
	      else {
	    	  System.out.println("---------------------------------------");
	    	  System.out.println("Invalid code entered!");
	      }
	      }  
	      

	      // Determine base price using switch
	      switch (code) {
	         case 1:
	            totalPrice += silverPrice;
	            System.out.println("You have selected: Silver Package");
	            break;
	         case 2:
	            totalPrice += goldPrice;
	            System.out.println("You have selected: Gold Package");
	            break;
	         case 3:
	            totalPrice += platinumPrice;
	            System.out.println("You have selected: Platinum Package");
	            break;
	         default:
	            System.out.println("Invalid code entered! Please try again");
	            return;
	      }
	      // Ask user for liveBand and photoBooth
	      System.out.print("Do you want to add LiveBand? :RM2000 (Y/N)= ");
	      char liveband = input.next().toUpperCase().charAt(0);
	      if (liveband == 'Y') 
	         totalPrice += liveBand;
	      else {
	    	  System.out.println("Invalid input entered!");
	      }
	      

	      System.out.print("Do you want PhotoBooth? :RM1000 (Y/N)= ");
	      char photobooth = input.next().toUpperCase().charAt(0);
	      if (photobooth == 'Y') 
	         totalPrice += photoBooth;
	      else {
	    	  System.out.println("Invalid input entered!");
	      }
	      

	      // When user choose both add-ons
	      if (liveband == 'Y' && photobooth == 'Y' && code == 3) {
	         System.out.println("You are entitled to a complimentary honeymoon suite!");
	      }

	      // Display total price
	      System.out.println("==========================================================");
	      System.out.println("The Total Price is= RM" + totalPrice);

	      input.close();

	   }
	}

