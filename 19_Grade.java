import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        System.out.println("Welcome to Grade calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your percentage: ");
        float Percentage = input.nextFloat();
        if(Percentage >= 90){
            System.out.println("You hava got A");
        } else if ( Percentage >= 75){
            System.out.println(" Good, You have good a b grade:");
        } else if(Percentage >= 60){
            System.out.println("You have got c, Work harder next time:");
        } else if (Percentage >= 30){
            System.out.println("you have got D, you seriously need to work:");
        } else{
            System.out.println("Sorry, you have failed the test and got  a F ");
        }
    }
}
