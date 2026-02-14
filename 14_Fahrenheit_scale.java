import java.util.Scanner;
 class Fahrenheit_scale {
     public static void main(String[] args) {
         System.out.println(" Welcome to conversion of Fahrenheit to celsuis ");
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter the value of Fahrenheit:");
         float f = input.nextFloat();

         float celsuis = (f - 32) * 5/9 ;
         System.out.println("The value of the celsuis is " + celsuis + "Degree celsuis");

     }
}
