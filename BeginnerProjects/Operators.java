import java.util.Scanner;

public class Operators{
    public static void main(String[]args){
        int input_Number1,input_Number2,sum,sub,mult,div,mod;
        Scanner Sc=new Scanner(System.in);
        input_Number1=Sc.nextInt();
        input_Number2=Sc.nextInt();
         //Addition or Sum
         sum=input_Number1+input_Number2;
         System.out.println("The addition of two numbers is "+sum);
        //Subtraction
        sub=input_Number1-input_Number2;
        System.out.println("The Subtraction of two number is "+sub);
        //Multiplication
        mult=input_Number1*input_Number2;
        System.out.println("The Multiplication of two number is "+mult);
        //divide
        div=input_Number1/input_Number2;
        System.out.println("The Division of two number is "+div);
        //Modulo
        mod=input_Number1%input_Number2;
        System.out.println("The Modulo of the two numbers is "+mod);
    }
}