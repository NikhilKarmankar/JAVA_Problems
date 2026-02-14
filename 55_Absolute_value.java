import java.util.Scanner;
class Absolute_value {
    public static void main(String[] args) {
        System.out.println("Welcome to find absolute number:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num = input.nextInt();
        if(num<0){
            System.out.println("The absolute num is " + -num);
        }else {
            System.out.println("The absolute num is " + num);
        }
    }
}
