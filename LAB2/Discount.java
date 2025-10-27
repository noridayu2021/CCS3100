package LAB2;

import java.util.Scanner;//Scanner is in the java.util package
public class Discount {
  public static void main(String[]args){
	  
	  //Create a Scanner object
	  Scanner input = new Scanner (System.in);
	  
	  //Prompt the user to enter the item price
	  System.out.println("Enter the price for the item= ");
	  double item = input.nextDouble();
	 
	  //Compute the Total Amount
	  double totalAmount=item*0.9;
     
	  //Display the Total Amount
	  System.out.println("The total amount after discount is "+ totalAmount);
			  
      input.close();
  }
}
 