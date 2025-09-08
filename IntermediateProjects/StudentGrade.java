import java.util.Scanner;

public class StudentGrade {
    public static void main(String[]args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Grade day");
        String subject1,subject2,subject3;
        System.out.println("Enter the Name of the Subjects: ");
        subject1=sc.nextLine();
        subject2=sc.nextLine();
        subject3=sc.nextLine();
        int subject_marks1,subject_marks2,subject_marks3,total,avg;
        System.out.println("Enter the marks of the subjects :");
        subject_marks1=sc.nextInt();
        subject_marks2=sc.nextInt();
        subject_marks3=sc.nextInt();
        
        total=subject_marks1+subject_marks2+subject_marks3;
        System.out.println("The total marks :"+total);

        avg=total/3;
        System.out.println("The Average marks are: "+avg);
        

        if(avg>=90 && avg<=100){
            System.out.println("A");
        }
        else if(avg>=75 && avg<=89){
            System.out.println("B");
        }
        else if(avg>=60 && avg<=74){
            System.out.println("C");
        }
        else if(avg>=40 && avg<=59){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

    }
}
