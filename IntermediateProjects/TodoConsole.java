import java.util.Scanner;

public class TodoConsole {
    public static void main(String[]args){
           System.out.println("Hello Sir I am Comrade ! your Java daily assistant anyhelp ?");
           Scanner sc =new Scanner(System.in);
     
           
          while (true) {
    // 1. Show menu
    System.out.println("1. Add Task");
    System.out.println("2. View Tasks");
    System.out.println("3. Mark Task as Done");
    System.out.println("4. Delete Task");
    System.out.println("5. Exit");

      int options=sc.nextInt();

    // 3. Handle with switch
    switch (options) {
        case 1:
         //Add tasks
            break;
        case 2:
            // View tasks
            break;
        case 3:
            // Mark as done
            break;
        case 4:
            // Delete task
            break;
        case 5:
            // Exit the loop
            return; // or break out of loop
        default:
            System.out.println("Invalid choice, try again!");
    }
}

    }
}
