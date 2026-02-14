import java.util.Scanner;
class Sum_of_digits {
     public static void main(String[] args) {
        System.out.println("Welcome to calculate the sum of digit:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("sum of digits is: " + sum );

    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while ( num > 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum ;
    }
}
