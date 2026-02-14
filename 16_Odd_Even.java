import java.util.Scanner;
class Odd_Even {
    public static void main(String[] args) {
        System.out.println("Welcome to find odd-even number :");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number :");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The number is even:");
        }else {
            System.out.println("the number is odd:");
        }
    }
}
