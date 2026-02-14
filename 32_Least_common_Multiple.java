import java.util.Scanner;
class Least_common_Multiple {
    public static void main(String[] args) {
        System.out.println("Welcome to find least common multiple:");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number:");
        int first = input.nextInt();
        System.out.println("Please enter your number:");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("Lcm of two number is :" + lcm);

    }
    public static int lcm(int first, int second){
        int i = 1;
        while( true ){
            int factor = first *i;
            if (first % second == 0){
                return factor;

            }
            i++;

        }

    }
}
