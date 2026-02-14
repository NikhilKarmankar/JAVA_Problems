import java.util.Scanner;

 class Prime_num {
    public static void main(String[] args) {
        System.out.println("Welcome! Let's check if a number is prime.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            boolean isPrime = true;

            // Check divisors from 2 to num - 1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }

        input.close();
    }
}
