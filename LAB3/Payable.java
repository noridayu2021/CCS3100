import java.util.Scanner;
public class Payable{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        double Payable;
        double Installment;
        
        //Read phone price,deposit paid and monthly interest rate
        System.out.print("Phone price:RM");
        double PhonePrice=input.nextDouble();
        
        System.out.print("Deposit paid:RM");
        double DepositPaid=input.nextDouble();
        
        System.out.print("Monthly interest rate (%):");
        double InterestRate=input.nextDouble();
        
        //Calculate total amount payable and monthly installment
        Payable=(PhonePrice-DepositPaid)*(1+(InterestRate*12/100));
        Installment=Payable/12;
        
        //Display total amount payable and monthly installment
        System.out.println("The total amount payable:RM"+Payable);
        System.out.print("The monthly installment:RM"+Installment);


    }
}
