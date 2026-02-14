import java.util.Scanner;
 class Simple_interest {
     public static void main(String[] args) {
         System.out.println("To find simple interest please come here:");
         Scanner input = new Scanner(System.in);
         System.out.println("please enter value of princlple interest :");
         double p = input.nextDouble();
         System.out.println("Please enter value of rate :");
         double r = input.nextDouble();
         System.out.println("Please enter value of time :");
         double t = input.nextDouble();

          Double simple_interest = (p * r * t)/100 ;
         System.out.println("The result for the simple interest is :" + simple_interest);
     }
}
