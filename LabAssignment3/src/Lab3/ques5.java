package Lab3;

import java.util.Scanner;

public class ques5 {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner loancalc = new Scanner(System.in);
		
		//input
		System.out.print("Enter the phone price: RM");
		double ActualPrice = loancalc.nextDouble();
		
		System.out.print("Enter the deposit paid: RM");
		double Deposit = loancalc.nextDouble();
		
		System.out.print("Enter the monthly interest rate (%): ");
		double Rate = loancalc.nextDouble();
		
		//process
		double PriceAfterDeposit = ActualPrice - Deposit;
		double InterestRate = Rate/100;
		double Interest = PriceAfterDeposit*InterestRate;
		double TotalAmountPayable = PriceAfterDeposit + Interest;
		double MonthlyInstallment = TotalAmountPayable/12;
		
		//output
		System.out.println("The total amount payable: RM" + TotalAmountPayable);
		System.out.println("The monthy installment : RM" + MonthlyInstallment + "/month");
		
		loancalc.close();
		
	}

}
