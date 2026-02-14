import java.util.Scanner;
class Bitwise_XoR {
    public static void main(String[] args) {
        System.out.println("Showcasing Bitwise XOR Operator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int first = input.nextInt();
        System.out.println("Please enter the second number:");
        int second = input.nextInt();
        int result = first ^ second ;
        System.out.println("result is : " + result);
    }
}
