import java.util.Scanner;

public class Strings {
    public static void main(String[]args){
      /*   //Take a string input and print its length
         Scanner sc= new Scanner(System.in);
        String input_str;
        System.out.println("The Input String is :");
        input_str=sc.nextLine();
        System.out.println("The length of the given Input string is :"+input_str.length());
        */
     /*  // Concatenate two strings without using + operator (use functions).
        String input_str1,input_str2;
        Scanner sc = new Scanner(System.in);
        input_str1=sc.nextLine();
        input_str2=sc.nextLine();
        System.out.println("The concatenated string is : "+input_str1+input_str2);
       */
        //Check if a string is empty or not.
       
       /*  String input_str;
        Scanner sc= new Scanner(System.in);
        input_str=sc.nextLine();
        if(input_str.isEmpty()){
              System.out.println("The String is Empty!");
        }
        else{
            System.out.println("The string is not Empty! It contains some content!");
        }
       */
        //Input a string and print it in uppercase and lowercase.

        String input_str,uppercase_str,lowercase_str;
        Scanner sc= new Scanner(System.in);
        System.out.println("Type the input string: ");
        input_str=sc.nextLine();
        uppercase_str=input_str.toUpperCase();
        System.out.println("The upper case of the given input String :"+uppercase_str);
        lowercase_str=input_str.toLowerCase();
        System.out.println("The lowercase of the given input string is: "+lowercase_str);

        sc.close();  
    }
    
}
