import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to be entered: ");
        int n = sc.nextInt();

        int[] array = new int[n];  

        System.out.println("Enter the Array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The Array of Numbers: ");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
