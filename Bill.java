import java.util.Scanner;
public class Bill{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        double Bill;
        
        //Read minute of calls, SMS and MB of mobile data
        System.out.print("Minute of calls:");
        double MinuteCalls=input.nextDouble();
        
        System.out.print("SMS:");
        int SMS=input.nextInt();
        
        System.out.print("MB of mobile data:");
        int MB=input.nextInt();
        
        //Calculate the total monthly bill
        Bill=40+(0.15*MinuteCalls)+(0.10*SMS)+(0.05*MB);
        
        //Display the total monthly bill
        System.out.print("The total monthly bill is:RM"+Bill);


    }
}