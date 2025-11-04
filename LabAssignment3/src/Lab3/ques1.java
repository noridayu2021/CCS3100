package Lab3;

import java.util.Scanner;

public class ques1 {
	
	public static void main (String[]args) {
		
		//scanner
		Scanner cgpacalc = new Scanner (System.in);
		
		//input grade and credit hour
		System.out.print("Enter grade for 1st subject (A=4.0, B=3.5, C=3.0):");
		double firstgrade = cgpacalc.nextDouble();
		
		System.out.print("Enter credit hour for 1st subject:");
		double firstch = cgpacalc.nextDouble();
		
		System.out.print("Enter grade for 2nd subject (A=4.0, B=3.5, C=3.0):");
		double secondgrade = cgpacalc.nextDouble();
		
		System.out.print("Enter credit hour for 2nd subject:");
		double secondch = cgpacalc.nextDouble();
		
		System.out.print("Enter grade for 3rd subject (A=4.0, B=3.5, C=3.0):");
		double thirdgrade = cgpacalc.nextDouble();
		
		System.out.print("Enter credit hour for 3rd subject:");
		double thirdch = cgpacalc.nextDouble();
		
		System.out.print("Enter grade for 4th subject (A=4.0, B=3.5, C=3.0):");
		double fourthgrade = cgpacalc.nextDouble();
		
		System.out.print("Enter credit hour for 4th subject:");
		double fourthch = cgpacalc.nextDouble();
		
		
		//process
		double Totalgpa = (firstgrade*firstch) + (secondgrade*secondch) + (thirdgrade*thirdch) + (fourthgrade*fourthch);
		double TotalCreditHour = firstch+secondch+thirdch+fourthch;
		double Totalcgpa = Totalgpa / TotalCreditHour;
		
		//output
		System.out.println("Your Total CGPA is:" + Totalcgpa);
		
		cgpacalc.close();
	}

}
