import java.util.Scanner;
class Right_Shift {
    public static void main(String[] args) {
        System.out.println("Welcome to Showcase LeftShift operator \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = input.nextInt();

        int result = num >> 1 ;
        System.out.println("Your result is : " + result);
    }
}
