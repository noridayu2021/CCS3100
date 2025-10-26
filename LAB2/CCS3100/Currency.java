import java.util.Scanner;
public class Currency{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Malaysian Ringgit (MYR):");
        double amount=input.nextDouble();
        
        //Convert Malaysian Ringgit into USD,EURO,YEN
        double Usd=amount*0.21;
        double Euro=amount*0.19;
        double Yen=amount*33.5;
        
        //Display Malaysian Ringgit in USD,EURO,YEN
        System.out.println("USD:"+Usd);
        System.out.println("EURO:"+Euro);
        System.out.println("YEN:"+Yen);
    }
}
