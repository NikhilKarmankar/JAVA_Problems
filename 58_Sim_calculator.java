import java.util.Scanner;

class Sim_calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Calculator:");
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.println("Please Enter your first number:");
        int num1 = input.nextInt();
        System.out.println("Now enter your second number:");
        int num2 = input.nextInt();

        // Perform operations
        newAddition(num1, num2);
        newSubtraction(num1, num2);
        newMultiplication(num1, num2);
        newDivision(num1, num2);
    }

    // Addition method
    public static void newAddition(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("The sum of two numbers is: " + result);
    }

    // Subtraction method
    public static void newSubtraction(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("The difference of two numbers is: " + result);
    }

    // Multiplication method
    public static void newMultiplication(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("The product of two numbers is: " + result);
    }

    // Division method
    public static void newDivision(int num1, int num2) {
        if (num2 != 0) {
            double result = (double) num1 / num2; // Cast to double for precision
            System.out.println("The division of two numbers is: " + result);
        } else {
            System.out.println("Division by zero is not allowed!");
        }
    }
}
