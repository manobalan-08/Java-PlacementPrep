import java.util.Scanner;

public class Strings {
    public static void main(String[]args){
        //Take a string input and print its length
         Scanner sc= new Scanner(System.in);
        String input_str;
        System.out.println("The Input String is :");
        input_str=sc.nextLine();
        System.out.println("The length of the given Input string is :"+input_str.length());
    }
    
    
}
