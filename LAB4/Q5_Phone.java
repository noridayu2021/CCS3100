package LAB4;
import java.util.Scanner;
public class Q5_Phone {
   public static void main(String[]args) {
		  
		  //Create a Scanner object
		  Scanner input=new Scanner(System.in);
		  
		  //declare
		  double phonePrice;
		  double deposit;
		  double interestRate;//Interest rate in percentage
		  double principle;
		  final double percentage;// represents 10%
		  double monthlyInstallment = 0.0;
		  double totalAmountPayable = 0.0;
		  
		  //Input from user 
		  System.out.print("Enter phone price= RM");
		  phonePrice=input.nextDouble();
		  System.out.print("Enter deposit paid= RM");
		  deposit=input.nextDouble();
		  System.out.print("Enter Monthly interest rate (%)= ");
		  interestRate=input.nextDouble();
		  
		  //calculation of deposit
		  percentage=phonePrice*0.10;
		  
		  //if deposit is < 10% of the phone price
		  if (deposit< percentage) {
			  System.out.println("Minimun 10% deposit required!");
		  }
		  else {
			  principle=phonePrice-deposit;
		  }
		   //Process
		    double rate=interestRate/100;//Interest rate
			double base=1+rate, exponent=12;
		   	monthlyInstallment+= (phonePrice-deposit)*(rate)*(Math.pow(base, exponent))/((Math.pow(base, exponent))-1);//Monthly installment
			totalAmountPayable+= (monthlyInstallment*12)+deposit;//Total amount payable
		   
			//if statement for interest rate
		    if (interestRate==0) {
		    	System.out.println("Interest-free installment");
		    	monthlyInstallment=(phonePrice-deposit)/12;
		    	totalAmountPayable=(monthlyInstallment*12)+deposit;
		    }
		    else if(interestRate > 5) {
		    	System.out.println("High Interest rate applied");
			}	
		    
		    else {
		    	System.out.println("Standard installment plan applied");
			}
		    
		    
			  
			  //Output
			  System.out.println("The Total Amount Payable is=RM"+totalAmountPayable );
			  System.out.println("The Monthly Installment is=RM"+ monthlyInstallment );
			  
		    input.close();
   }		  
}

