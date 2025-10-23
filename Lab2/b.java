import  java.util.Scanner;
public class b {
    public static void main(String[] args) {
        double myr,usd,euro,yen;
        Scanner scan = new Scanner(System.in);
        System.out.println("input an amount in MYR:");
         if (scan.hasNextLine()) {
            myr = scan.nextDouble();
            usd=myr*0.21;
            euro=myr*0.19;
            yen=myr*33.5;
            System.out.println("the MYR = " + myr);
            System.out.println("the USD = " + usd);
            System.out.println("the EURO = " + euro);
            System.out.println("the YEN = " + yen);
        }
        scan.close();
        //WUJUNXUE bc254180
    }
}
