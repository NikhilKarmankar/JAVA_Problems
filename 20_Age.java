import java.util.Scanner;
 class Age {
     public static void main(String[] args) {
         System.out.println("Welcome to the age Calculator:");
         Scanner input = new Scanner(System.in);
         System.out.println("Please enter your age:");
         int age = input.nextInt();

         if ( age >= 65){
             System.out.println("You are a senior citizen");
         } else if ( age >= 20) {
             System.out.println(" you are an adult");
         }else if ( age >= 13) {
             System.out.println("you are a teenager");
         } else{
             System.out.println("you are a child");
         }
     }
}
