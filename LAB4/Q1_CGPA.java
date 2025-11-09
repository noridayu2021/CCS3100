package LAB4;
import java.util.Scanner;
public class Q1_CGPA {
   public static void main(String[]args) {
	   //Create a Scanner object 
	   Scanner input=new Scanner (System.in);
		   
	   //declare 
	  double creditHour=0.0;
	  double gradePoint=0.0;
	  boolean valid=true;
	  double totalCreditHour=0.0;
	  double totalGradePoint=0.0;
	  
	  
	  System.out.println("====== CGPA Calculator=====");
	
	  //loop 
	  for (int i=1; i<=4; i++ ) {
		 //input from user 
		  System.out.print("Enter the grade for subject " + i + ":" );
		  String grade=input.next().toUpperCase();
		  System.out.print("Enter credit hour=");
		  creditHour=input.nextDouble();
		  
		  if (grade.equals("A")) {
			  gradePoint=4.0;
			 
		  }
		  else if (grade.equals("B")) {
			  gradePoint=3.0;
			 
		  }
		  else if (grade.equals("C")) {
			  gradePoint=2.0;
			
		  }
		  else if (grade.equals("D")) {
			  gradePoint=1.0;
			
		  }
		  else if (grade.equals("F") ){
			  gradePoint=0.0;
			 
		  } 
		  else {
			  System.out.println(" Incorrect grade entered!");
			  valid=false;
			 
		  }
			  
		  if(valid) {
		    totalCreditHour+=creditHour;
		    totalGradePoint+=(gradePoint*creditHour);
		   
		  }
		     else {
		    	
		  }
		
	  }
	  //calculate and display CGPA
      if(valid) { 
	     double cgpa= totalGradePoint/totalCreditHour;
	     System.out.print("CGPA= " + cgpa);
   } 
      else { 
	      System.out.print("CGPA cannot be calculated due to incorrect input entered ");
   }
   
   
   
   input.close();
		 
   }
   }

   

