import java.util.Scanner;
class Number_Guessing {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game :");
        int num = 5,guess;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Please guess the number between 0 to 10:");
             guess = input.nextInt();
        }while(num != guess);
        System.out.println("you have Successfully guess the number: ");


    }
}