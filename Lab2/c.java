import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        double m=0,p=0;
        int y=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("input an amount in Principal:");
         if (scan.hasNextLine()) {
            m = scan.nextDouble();
         }
        System.out.println("input an amount in year:");
         if (scan.hasNextLine()) {
            y = scan.nextInt();
         }
         scan.close();
        p = m*y*0.04;
        System.out.println("the total interest is:"  + p);
        System.out.println("the total payment amount is:" + (m+p));
        //WUJUNXUE bc254180
    }
}
