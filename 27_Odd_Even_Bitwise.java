import java.util.Scanner;
class Odd_Even_Bitwise {
    public static void main(String[] args) {
        System.out.println("Welcome to odd_even_bitwise Calculator: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = input.nextInt();

        if((num & 1 ) == 1){
            System.out.println("your number is odd ");
        }else{
            System.out.println("your number is even");
        }
    }
}
