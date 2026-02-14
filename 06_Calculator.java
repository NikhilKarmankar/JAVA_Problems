import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to our Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter First number: ");
        int firstNum = input.nextInt();
        System.out.println("now Please enter a Second number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum ;
        System.out.println("The sum of two number is " + sum );
    }
}
