package LAB3;
import java.util.Scanner;
public class Q1_CGPA {
 public static void main(String[]args) {
	 //Create Scanner object
	 Scanner input=new Scanner(System.in);
	 
	 //input
	 System.out.println("Enter grade point for first subject= ");
	 double gradePoint1=input.nextDouble();
	 System.out.println("Enter credit hour for first subject= ");
	 double creditHour1=input.nextDouble();
	 System.out.println("Enter grade point for second subject= ");
	 double gradePoint2=input.nextDouble();
	 System.out.println("Enter credit hour for second subject= ");
	 double creditHour2=input.nextDouble();
	 System.out.println("Enter grade point for third subject= ");
	 double gradePoint3=input.nextDouble();
     System.out.println("Enter credit hour for third subject= ");
     double creditHour3=input.nextDouble();
     System.out.println("Enter grade point for fourth subject= ");
     double gradePoint4=input.nextDouble();
     System.out.println("Enter credit hour for fourth subject= ");
     double creditHour4=input.nextDouble();
     
     //Calculate CGPA
     double totalCreditHour=creditHour1+creditHour2+creditHour3+creditHour4;//Total credit hour 
     double GPA1=gradePoint1*creditHour1;// GPA 1
     double GPA2=gradePoint2*creditHour2;//GPA 2
     double GPA3=gradePoint3*creditHour3;//GPA 3
     double GPA4=gradePoint4*creditHour4;//GPA 4
     double CGPA=(GPA1+GPA2+GPA3+GPA4)/totalCreditHour;//CGPA
     
     //Display CGPA
     System.out.println("CGPA= "+CGPA);
     
     input.close();
     
     
 }
}
