package LAB3;
import java.util.Scanner;
public class Q3_BMI {
 public static void main(String[]args) {
	 //Create a Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //Input
	 System.out.println(" Enter Weight(kg)= ");//Weight
	 double weight=input.nextDouble();
	 System.out.println(" Enter height(m)= ");//Height
	 double height=input.nextDouble();
	 System.out.println(" Enter age= ");//Age
	 double age=input.nextDouble();
	 
	 //Proses
	 double BMI= weight/(height*height);//Calculate BMI
	 double bodyFatPercentage=(1.2*BMI)+(0.23*age)-5.4;//Calculate body fat %
	 
	 //Output
	 System.out.println(" BMI= " + BMI);
	 System.out.println(" Body Fat %= " + bodyFatPercentage);
	 
	 input.close();
	 
			 
	 
 }
}
