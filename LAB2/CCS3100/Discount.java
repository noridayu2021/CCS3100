 import java.util.Scanner;
public class Discount {
  public static void main (String [] args) {
      double totalAmount;
      Scanner input=new Scanner (System.in);
      System.out.println("Items value:RM");
      double items=input.nextDouble();
      
      //Calculate total amount to pay
      totalAmount=(items*0.9);
      
      //Display total amount to pay
      System.out.println("The total amount is:"+totalAmount);
  }
}
