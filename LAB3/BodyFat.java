import java.util.Scanner;
public class BodyFat{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        
        double BMI;
        double BodyFat;
        
        //Read weight, height and age
        System.out.print("Enter weight(kg):");
        double Weight=input.nextDouble();
        
        System.out.print("Enter height(m):");
        double Height=input.nextDouble();
        
        System.out.print("Enter age:");
        int Age=input.nextInt();
        
        //Calculate BMI and body fat percentage
        BMI=Weight / (Height * Height);
        BodyFat=(1.20*BMI)+(0.23*Age)-5.4;
        
        //Display BMI and body fat percentage
        System.out.println("BMI:"+BMI);
        System.out.printf("Body Fat Percentage: %.2f%%", BodyFat);
        

    }
}
