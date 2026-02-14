import java.util.Scanner;
 class Input_name {
     public static void main(String[] args) {
         System.out.println("Plese enter your name: ");
         Scanner input = new Scanner(System.in);
         String name =input.nextLine();
         System.out.println("Welcome "+name + " to coding world");
     }
}
