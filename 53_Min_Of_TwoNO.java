import java.util.Scanner;
class Min_Of_TwoNO {
    public static void main(String[] args) {
        System.out.println("Welcome to find minimum of two number:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please your first number: ");
        int num1 = input.nextInt();
        System.out.println("Now enter the second number:");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("the minimum number is " + num2);
        }else{
            System.out.println("the minimum number is " + num1);
        }
    }
}
