package LAB_Assignment2;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {

        // declare
        int units = 0;
        double rate = 0;
        double totalBill = 0;
        boolean valid = false;

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // input from user
        while (!valid) {
            System.out.println("=======Electricity bill Calculator=======");
            System.out.print("Enter the number of electricity units used (kWh)= ");
            units = input.nextInt();

            if (units > 0) {
                valid = true;
            } else {
                System.out.println("Invalid unit entered! ");
            }
        }

        // rate for each unit
        if (units >= 0 && units <= 200) 
            rate = 0.21;
        else if (units >= 201 && units <= 300) 
            rate = 0.33;
        else if (units >= 301 && units <= 600) 
            rate = 0.50;
        else if (units > 600) 
            rate = 0.65;
     

        // calculate the total bill
        totalBill += rate * units;
       

        // Display the total bill
        System.out.println("The Total Bill is= RM " + totalBill);
        
        //when total bill exceeds
        if(totalBill>100)
        	System.out.println("High usage detected - please conserve energy!");
       

        input.close();

    }

}


