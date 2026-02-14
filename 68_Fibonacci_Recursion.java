import java.util.Scanner;
class Fibonacci_Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to print the fibonacci serious:");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to which you want to print:");
        int count = input.nextInt();
        for(int i = 1 ;i<= count ; i++) {
            System.out.println(fibonaaci(i) + " ");
        }
    }

    public static int fibonaaci(int position){
        if ( position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fibonaaci(position -1) + fibonaaci(position-2);

    }
}
