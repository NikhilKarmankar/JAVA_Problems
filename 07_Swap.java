import java.util.Scanner;
 class Swap {
     public static void main(String[] args) {
         System.out.println("Welcome to the Swapping world:");
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the First num:");
         int firstNum = input.nextInt();
         System.out.println("Enter the Second num:");
         int secondNum = input.nextInt();
         int temp = firstNum ;
          firstNum = secondNum;
          secondNum = temp ;
         System.out.println("Now the First number is: " + firstNum );
         System.out.println("Now the Second  number is: " + secondNum );

     }
}

