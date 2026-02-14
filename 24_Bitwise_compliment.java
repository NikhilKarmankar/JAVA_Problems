import java.util.Scanner;
 class Bitwise_compliment {
     public static void main(String[] args) {
         System.out.println("Welcome to showcase of not/compliment operator:");
         Scanner input = new Scanner(System.in);
         System.out.println(" Please enter your number:");
         int num = input.nextInt();

         int result = ~num;
         System.out.println("Your result is :" + result);
     }
}
