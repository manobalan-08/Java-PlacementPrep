import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[]args){
         System.out.println("Welcome to temperature hacks!");
         Scanner sc = new Scanner(System.in);
        
         while(true){
            System.out.println("Choose the option :");
            System.out.println("1.Celcius");
            System.out.println("2.Fahrenheit");
            System.out.println("3.Kelvin");
            
            int choice=sc.nextInt();
            double Celcius,Fahrenheit,Kelvin;
            Celcius=sc.nextDouble();
            Fahrenheit=(Celcius * 9/5 )+32;
            Kelvin=Celcius+273.15;

            switch(choice){
                case 1:
                System.out.println("The celcius value is : "+Celcius);
                break;
                case 2:
                System.out.println("The Celcius to Fahrenheit value is : "+Fahrenheit);
                break;
                case 3:
                System.out.println("The Celcius to Kelvin value is : "+Kelvin);
                break;
                default:
                System.out.println("Invalid Option!");
            }

         }
    }
}
