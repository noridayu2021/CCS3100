package LAB3;
import java.util.Scanner;
public class Q5_Phone {
  public static void main(String[]args) {
	  
	  //Create a Scanner object
	  Scanner input=new Scanner(System.in);
	  
	  //Prompt the user to enter the information
	  System.out.println("Enter the phone price= ");//Phone price
	  double PhonePrice=input.nextDouble();
	  System.out.println("Enter the deposit paid= ");//Deposit paid 
	  double deposit=input.nextDouble();
	  System.out.println("Enter the monthly interest rate(%)= ");//Monthly interest rate
	  double interestRate=input.nextDouble();
	  
	  //Process
	  double rate=interestRate/100;//Interest rate
	  double base=1+rate, exponent=12;
	  double MonthlyInstallment= (PhonePrice-deposit)*(rate)*(Math.pow(base, exponent))/((Math.pow(base, exponent))-1);//Monthly installment
	  double TotalAmountPayable= (MonthlyInstallment*12)+deposit;//Total amount payable
	  
	  //Output
	  System.out.println(" The Toatal Amount Payable is= "+TotalAmountPayable );
	  System.out.println(" The Monthly Installment is= "+ MonthlyInstallment );
	  
	  input.close();
	  
	  
	  
  }
}
