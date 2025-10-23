import  java.util.Scanner;
public class e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double miles=0,yards=0,kilometres=0;
        System.out.println("input an amount in miles:");
        miles=scan.nextDouble();
        System.out.println("input an amount in yards:");
        yards=scan.nextDouble();
        scan.close();
        miles+=yards/1760;
        kilometres=miles*1.609344;
        System.out.println("the total distance in miles is:" + miles);
        System.out.println("the total distance in kilometres is:" + kilometres);
        //WUJUNXUE bc254180
    }
}
