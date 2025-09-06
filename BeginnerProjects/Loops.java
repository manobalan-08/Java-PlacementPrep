import java.util.Scanner;

public class Loops {
    public static void main(String[]args){
        //For-loop || Print Number from 1 to 10
        int n;
        Scanner Sc= new Scanner(System.in);
        System.out.println("The loop should continue until : ");
        n=Sc.nextInt();
        for(int i=1 ;i<=n;){
            System.out.println(i++);
        }
        Sc.close();
    }
}
