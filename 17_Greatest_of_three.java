import java.util.Scanner;
class Greatest_of_three {
    public static void main(String[] args) {
        System.out.println("Welcome to identify the number which is greatest:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your 1st number:");
        int a = input.nextInt();
        System.out.println("Please enter your 2nd number:");
        int b = input.nextInt();
        System.out.println("Please enter your 3rd number:");
        int c = input.nextInt();
        if (a > b  &&  a > c){
            System.out.println("The a is greatest:");
        }else if(b > a && b> c){
            System.out.println("The b is greatest:");
        }else {
            System.out.println("The c is greatest");
        }

    }
}
