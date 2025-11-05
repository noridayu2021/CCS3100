import java.util.Scanner;
public class CGPA3{
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        double GradePoint;
        double totalPoint=0;
        int totalCreditHours=0;
        double CGPA;
        double Point=0;
        
        //Enter Matric Number
        System.out.print("Matric Number:");
        String MatricNum=input.next();
        
        //Loop for 4 subjects
        for(int i=1; i<=4; i++){
            System.out.println("Subject code:");
            String Subject=input.next();
            
            System.out.print("Enter grade for "+ Subject+ ":");
            String Grade=input.next().toUpperCase();
            
            System.out.print("Enter credit hours for "+Subject+":");
            int CreditHours=input.nextInt();
            
            //Use if-else to assign grade point
            if(Grade.equals("A")){
                Point=4.0;
            }else if (Grade.equals("A-")){
                Point=3.75;
            }else if (Grade.equals("B+")){
                Point=3.5;
            }else if (Grade.equals("B")){
                Point=3.0;
            }else if (Grade.equals("B-")){
                Point=2.75;
            }else if (Grade.equals("C+")){
                Point=2.50;
            }else if(Grade.equals("C")){
                Point=2.0;
            }else if(Grade.equals("C-")){
                Point=1.75;
            }else if(Grade.equals("D+")){
                Point=1.50;
            }else if(Grade.equals("D")){
                Point=1.00;
            }else if(Grade.equals("F")){
                Point=0.0;
            }else{
                System.out.println("Invalid grade entered!");
            }
            
            GradePoint=Point*CreditHours;
            totalPoint=totalPoint+GradePoint;
            totalCreditHours=totalCreditHours+CreditHours;
            
        
        }
        //Calculate CGPA
        CGPA=totalPoint/totalCreditHours;
        
        //Display CGPA
        System.out.println("----------------------------------");
        System.out.print("Your CGPA will be:"+ totalPoint +"/"+totalCreditHours+"="+CGPA);
        
        
    }
}
