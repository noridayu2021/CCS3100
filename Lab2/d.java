import  java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input an amount in distance travelled:");
        double all=scan.nextDouble();
        scan.close();
        System.out.println("the total fuel cost for the trip is:"  + (all/100*6.5*2.1));
        //WUJUNXUE bc254180
    }
}
