import java.util.Scanner;

 class ControlFlow {
    public static void main(String[]args){
     //if -else statement || Triangle Validity Problem
        double angle_one,angle_two,angle_three,AngleSum;
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Three angles: ");
        angle_one=Sc.nextDouble();
        angle_two=Sc.nextDouble();
        angle_three=Sc.nextDouble();
        
        AngleSum=angle_one+angle_two+angle_three;

        if(AngleSum == 180.00 && angle_one>0 && angle_two>0 && angle_three>0){
            System.out.println("The triangle is valid one!");
        }
        else{
            System.out.println("The triangle is not a valid one!");
        }
        
        Sc.close();
        
        //else-if Statements || Shop Discounts 
        float Bill_price,discount;

        Scanner SC= new Scanner(System.in);
        System.out.println("Enter the Bill amount: ");
        Bill_price=SC.nextFloat();
        if(Bill_price>500){
           discount=Bill_price*20/100;
           System.out.println("The Discount for you is : "+discount);
        }
        else if(Bill_price>200){
            discount=Bill_price*10/100;
            System.out.println("The Discount for you is :"+discount);
        }
        else{
            System.out.println("Sorry! You don't have any discount since you need to buy more!");
        }


    }
}
