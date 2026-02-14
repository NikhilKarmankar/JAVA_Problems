import java.sql.SQLOutput;
import java.util.Scanner;
 class Float_multiplication {
     public static void main(String[] args) {
         System.out.println("We are doing floating multiplication:");
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter first decimal number:");
         double first = input.nextDouble();
         System.out.println("now, please enter second number:");
         double second = input.nextDouble();

         double mul = first * second ;
         System.out.println(" result is: " + mul );
     }
}
