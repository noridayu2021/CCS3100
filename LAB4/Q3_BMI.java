package LAB4;
import java.util.Scanner;
public class Q3_BMI {
  public static void main(String[]args) {
	  //Create a Scanner object 
	  Scanner input=new Scanner(System.in);
	 
	  //declare 
	  double weight,height,age;
	  double BMI=0.0;
	  double bodyFatPercentage=0.0;
	  boolean valid=true;
	
	  //Input
	     System.out.println("===== BMI Calculator=====");
		 System.out.print(" Enter Weight(kg)= ");//Weight
		 weight=input.nextDouble();
		 System.out.print(" Enter height(m)= ");//Height
		 height=input.nextDouble();
		 System.out.print(" Enter age= ");//Age
		 age=input.nextDouble();
		 
	 //calculate
	 BMI= weight/(height*height);//Calculate BMI
	 bodyFatPercentage=(1.2*BMI)+(0.23*age)-5.4;//Calculate body fat %
		 
		 
	//if statement 
		 if (age>=18) 
			 if (BMI<18.5)
			  System.out.println(" Underweight");
		 
			  else if (BMI >= 18.5 && BMI<= 24.9)
		        System.out.println("Healthy");
			  
	         else 
	    	    System.out.println(" Overweight");
		 
		 else {
				System.out.println("Body fat estimation only for adults (18+)");
	           return;
		 }
		 
		 if (valid) {
		 //Display BMI and Body Fat %
		 System.out.println(" BMI= " + BMI);
		 System.out.println(" Body Fat %=  " +  bodyFatPercentage);
      }
		 else 
			
		 
	
		 input.close();
  }
}
