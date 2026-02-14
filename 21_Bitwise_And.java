import java.util.Scanner;
class Bitwise_And {
    public static void main(String[] args) {
        System.out.println("Showcasing Bitwise And Operator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int first = input.nextInt();
        System.out.println("Please enter the seconf number:");
        int second = input.nextInt();
        int result = first & second ;
        System.out.println("result is : " + result);
    }
}
