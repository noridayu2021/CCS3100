import java.util.Scanner;
public class NetSalary{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        double GrossSalary;
        double Tax;
        double NetSalary;
        
        //Read basic salary, allowance and deduction
        System.out.print("Enter basic salary:");
        double BasicSalary=input.nextDouble();
        System.out.print("Enter allowance:");
        double Allowance=input.nextDouble();
        System.out.print("Enter deduction:");
        double Deduction=input.nextDouble();
        
        //Calculate Net Salary
        GrossSalary=BasicSalary+Allowance;
        Tax=(GrossSalary*0.08);
        NetSalary=GrossSalary-Tax-Deduction;
        
        //Display net salary
        System.out.println(" ");
        System.out.print("Net salary:RM"+NetSalary);

        
        
    }
}