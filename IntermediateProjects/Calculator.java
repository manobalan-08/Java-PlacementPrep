import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("CalcX - Your Java Calculator Buddy!");
        Scanner sc = new Scanner(System.in);

        int Num1, Num2;
        System.out.println("Enter the two input Numbers :");
        Num1 = sc.nextInt();
        Num2 = sc.nextInt();

        System.out.println("Enter an operation (+, -, *, /, %): ");
        char ch = sc.next().charAt(0); 

        switch (ch) {
            case '+':
                int sum = Num1 + Num2;
                System.out.println("The addition of two Numbers is : " + sum);
                break;
            case '-':
                int sub = Num1 - Num2;
                System.out.println("The Subtraction of two numbers is : " + sub);
                break;
            case '*':
                int mult = Num1 * Num2;
                System.out.println("The Multiplication of two numbers is : " + mult);
                break;
            case '/':
                if (Num2 != 0) { //  To avoid division by zero
                    int div = Num1 / Num2;
                    System.out.println("The division of two numbers is : " + div);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;
            case '%':
                if (Num2 != 0) {
                    int mod = Num1 % Num2;
                    System.out.println("The modulo of two numbers is : " + mod);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Invalid Operation!");
                break;
        }

        sc.close();
    }
}
