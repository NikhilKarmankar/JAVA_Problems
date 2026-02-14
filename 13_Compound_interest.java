import java.util.Scanner;
 class Compound_interest {
     public static void main(String[] args) {
        System.out.println("Welcome to compound interest Calculator");
        Scanner input = new Scanner(System.in);
        System.out.println(" Can you please enter the value of principle:");
        float p = input.nextFloat();
        System.out.println(" Can you please enter the value of rate :");
        float r = input.nextFloat();
        System.out.println("Can you please enter the value of time :");
        float t = input.nextFloat();

        float compound_interest = p * (1 + (r/100)) * t ;
        System.out.println("The Result for the compound interest is : " + compound_interest + "." );


    }
}
