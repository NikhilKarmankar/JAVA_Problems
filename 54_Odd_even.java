import java .util.Scanner;
class Odd_even {
    public static void main(String[] args) {
        System.out.println("welcome to find odd even of the number :");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number:");
        int num = input.nextInt();

        if(num%2== 0){
            System.out.println("The number is even:");
        }else{
            System.out.println("The number is odd:");
        }
    }
}
