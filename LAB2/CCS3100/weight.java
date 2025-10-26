
import java.util.Scanner;
public class weight{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter grams:");
        double grams=input.nextDouble();
        
        //Convert grams into kilograms and pounds
        double kilograms=grams/1000;
        double pounds=kilograms*2.20462;
        
        System.out.println("Grams:"+grams);//Display weight in grams
        System.out.println("Kilograms:"+kilograms);//Display weight in kilograms
        System.out.println("Pounds:"+pounds);//Display weight in pounds
    }
}