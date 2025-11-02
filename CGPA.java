package Main;
import java.util.Scanner;

public class CGPA {
	public static void main(String[] args) {
		
		        Scanner input = new Scanner(System.in);

		        System.out.print("Matric: ");
		        String matric = input.nextLine();

		        double totalPoints = 0;
		        int totalCredits = 0;

		        System.out.print("Enter grade for CCS3100 (A/B/C): ");
		        char g1 = input.next().toUpperCase().charAt(0);
		        System.out.print("Enter credit hours for CCS3100: ");
		        int c1 = input.nextInt();

		        System.out.print("Enter grade for CCS3003 (A/B/C): ");
		        char g2 = input.next().toUpperCase().charAt(0);
		        System.out.print("Enter credit hours for CCS3003: ");
		        int c2 = input.nextInt();

		        System.out.print("Enter grade for PRT2009 (A/B/C): ");
		        char g3 = input.next().toUpperCase().charAt(0);
		        System.out.print("Enter credit hours for PRT2009: ");
		        int c3 = input.nextInt();

		        System.out.print("Enter grade for SKP2101 (A/B/C): ");
		        char g4 = input.next().toUpperCase().charAt(0);
		        System.out.print("Enter credit hours for SKP2101: ");
		        int c4 = input.nextInt();

		        totalPoints = getPoint(g1) * c1 + getPoint(g2) * c2 + getPoint(g3) * c3 + getPoint(g4) * c4;
		        totalCredits = c1 + c2 + c3 + c4;

		        double cgpa = totalPoints / totalCredits;

		        System.out.printf("\nYour CGPA is: %.2f\n", cgpa);
		    }

		    public static double getPoint(char grade) {
		        if (grade == 'A') return 4.0;
		        else if (grade == 'B') return 3.5;
		        else return 3.0; 
		    }
	}


