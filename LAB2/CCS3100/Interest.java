
import java.util.Scanner;
public class Interest{
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Loan Amount:");
        double loanAmount=input.nextDouble();
        System.out.println("Number of Years:");
        int numOfYears=input.nextInt();
        
        //Calculate total interest and total payment
        double totalInterest=loanAmount*0.04*numOfYears;
        double totalPayment=loanAmount+totalInterest;
        
        System.out.println("The total interest is:RM"+totalInterest);//Display total interest
        System.out.println("The total payment is:RM"+totalPayment);//Display total payment
    }
}

