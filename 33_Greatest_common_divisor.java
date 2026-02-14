import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Welcome to count GCD:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int first = input.nextInt();
        System.out.println("Please enter the second number:");
        int second = input.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of the numbers is: " + gcd);
    }

    // Corrected GCD method
    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int smallest = least(num1, num2);  // Use the least method to get the smallest number
        for (int i = 1; i <= smallest; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Corrected least method
    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
