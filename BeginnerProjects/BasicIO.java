import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String name=Sc.nextLine();
        int age=Sc.nextInt();
        int experience=Sc.nextInt();
        double salary=Sc.nextDouble();
        char fav_letter=Sc.next().charAt(0);
        System.out.println("Hey All! I am "+name+"I am a programmer Founder and CEO of Anchortrics");
        System.out.println("The Age of the founder is :"+age+"The experience of the founder is :"+experience);
        System.out.println("He earns about "+salary+"per month");
        System.out.println("The favorite letter of his Astrology is :"+fav_letter);

    
        Sc.close();
    }
}
