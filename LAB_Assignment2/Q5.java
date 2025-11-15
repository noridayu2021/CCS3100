package LAB_Assignment2;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {

	    // declare
	    int code = 0;
	    int quantity = 0;
	    double price = 0;
	    double totalPrice = 0;
	    String foodItem = "";
	    double afterDiscount = 0;
	    boolean validCode = false;
	    boolean valid = false;

	    // Create a Scanner object
	    Scanner input = new Scanner(System.in);

	    // input from user
	    while (!validCode) {
	      System.out.println("------Menu-----");
	      System.out.print("Enter menu code (1-4): ");
	      code = input.nextInt();
	      System.out.print("Enter quantity: ");
	      quantity = input.nextInt();

	      if (code >= 1 && code <= 4)
	        validCode = true;
	      else {
	        System.out.println("Invalid code entered!");
	        System.out.println("---------------------------------------");
	      }

	    }

	    // determine food item and food price using switch
	    switch (code) {
	      case 1:
	        foodItem = "Nasi Goreng";
	        price = 6.50;
	        break;

	      case 2:
	        foodItem = "Mee Goreng";
	        price = 6.00;
	        break;

	      case 3:
	        foodItem = "Nasi Lemak";
	        price = 5.50;
	        break;

	      case 4:
	        foodItem = "Chicken Chop";
	        price = 9.00;
	        break;

	      default:

	    }

	    // Display total Price
	    totalPrice += price * quantity;
	    System.out.println("You order: " + quantity + "x " + foodItem);
	    System.out.println("Total: RM" + totalPrice);

	    // rewards
	    while (!valid) {
	      if (totalPrice > 20) {
	        System.out.print("Choose your Reward: (D-Discount / F-Free Drink)= ");
	        char reward = input.next().toUpperCase().charAt(0);
	        if (reward == 'D') {
	          valid = true;
	          afterDiscount += totalPrice * 0.9;
	          System.out.println("Total Price after Discount= RM" + afterDiscount);
	        }
	        else if (reward == 'F') {
	          valid = true;
	          System.out.println("You are eligible for a free drink ! Please claim it ! ");
	        } 
	        else {
	          System.out.println("Invalid input entered!");
	          System.out.println("---------------------------------------");
	        }
	      }
	    }
	    input.close();

	  }
	}


