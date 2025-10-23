import  java.util.Scanner;
public class f {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input an amount in grams:");
        double g=scan.nextDouble(),kg=0,p=0;
        kg=g/1000;
        p=kg*2.20462;
        System.out.println("the grams is:" + g +"g");
        System.out.println("the kilogram is:" + kg + "kg");
        System.out.println("the pounds is:" + p + "pounds");
        //WUJUNXUE bc254180
    }
}
