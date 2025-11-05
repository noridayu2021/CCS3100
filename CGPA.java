import java.util.Scanner;
public class CGPA {
    public static void main (String [] args) {
        Scanner input= new Scanner (System.in);
    
        double CGPA1;
        double CGPA2;
        double CGPA3;
        double CGPA4;
        double totalPoint;
        int totalCreditHours;
        double CGPA;
        
        //Enter Matric Number
        System.out.print("Matric Number:");
        String MatricNum=input.next();
        
        //Enter subject code, grade point, credit hours for course 1
        System.out.print("Enter Subject Code:");
        String Subject1=input.next();
        System.out.print("Enter grade point for "+ Subject1+ ":");
        double Point1=input.nextDouble();
        System.out.print("Enter credit hours for "+Subject1+":");
        int CreditHours1=input.nextInt();
        System.out.println("-----");
        
        
        //Enter subject code, grade point, credit hours for course 2
        System.out.print("Enter Subject Code:");
        String Subject2=input.next();
        System.out.print("Enter grade point for "+ Subject2+ ":");
        double Point2=input.nextDouble();
        System.out.print("Enter credit hours for "+Subject2+":");
        int CreditHours2=input.nextInt();
        System.out.println("-----");
        
        
        //Enter subject code, grade point, credit hours for course 3
        System.out.print("Enter Subject Code:");
        String Subject3=input.next();
        System.out.print("Enter grade point for "+ Subject3+ ":");
        double Point3=input.nextDouble();
        System.out.print("Enter credit hours for "+Subject3+":");
        int CreditHours3=input.nextInt();
        System.out.println("-----");
        
        
        //Enter subject code, grade point, credit hours for course 4
        System.out.print("Enter Subject Code:");
        String Subject4=input.next();
        System.out.print("Enter grade point for "+ Subject4+ ":");
        double Point4=input.nextDouble();
        System.out.print("Enter credit hours for "+Subject4+":");
        int CreditHours4=input.nextInt();
        System.out.println("-----");
        
        //Calculate the grade points for each course 
        CGPA1=Point1*CreditHours1;
        CGPA2=Point2*CreditHours2;
        CGPA3=Point3*CreditHours3;
        CGPA4=Point4*CreditHours4;
        
        //Calculate the total point and total credit hours
        totalPoint=CGPA1+CGPA2+CGPA3+CGPA4;
        totalCreditHours=CreditHours1+CreditHours2+CreditHours3+CreditHours4;
        
        //Calculate the CGPA
        CGPA=totalPoint/totalCreditHours;
        
        //Display CGPA
        System.out.print("Your CGPA will be: (" +CGPA1+"+"+CGPA2+"+"+CGPA3+"+"+CGPA4+")/"+totalCreditHours+"="+CGPA);
    
        
    }
}

