import java.util.Scanner;
class Positive_Negative {
    public static void main(String[] args) {
        System.out.println("Welcome to identify the number is positive or negative:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your number:");
        int a = input.nextInt();
        if(a>0){
            System.out.println("The number is positive+ ");
        }else if(a<0){
            System.out.println("The number is negative- ");
        }else{
            System.out.println("The number is Zero0");
        }


    }
}
