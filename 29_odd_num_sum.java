import java.util.Scanner;
class odd_num_sum {
    public static void main(String[] args) {
        System.out.println("Welcome to calculate the sum of all odd number to n:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println(" Odd Sum till " + num + " is : " + sum);

    }
    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while(i<=num){
            sum = sum + i;
            i +=2;
        }
        return sum;
    }
}
