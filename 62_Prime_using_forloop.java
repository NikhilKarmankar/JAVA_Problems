import java.util.Scanner;
class Prime_using_forloop {
    public static void main(String[] args) {
        System.out.println("Welcome to check the number is prime or not");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("your number is "
                + (isPrime(num) ? "Prime" :"Not Prime"));

    }

    public static boolean isPrime(int num){
        for (int i = 2 ; i < num ; i++ ){
            if(num % i == 0){
                return false;
            }
        }
        return true  ;
    }
}
