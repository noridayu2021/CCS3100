import  java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input an amount in pay:");
        double pay = scan.nextDouble();
        scan.close();
        System.out.println("the total amount to pay is:" + pay);
        System.out.println("and the final price after applying the discount is:" + pay*(1-0.1));
        // WUJUNXUE bc254180
    }
}
