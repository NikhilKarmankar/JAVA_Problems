import java.util.Scanner;
class Multiplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to multiplication table:");
        System.out.println("Please enter your number");
        int num = scanner.nextInt();
        printMultiplicationTable(num);

    }

   public static void printMultiplicationTable(int num){
        int i = 1;
        while( i<= 10 ) {
            System.out.println(num + "X" + i + " = " + (num * i));
            i++;
        }

    }
}







//import java.util.Scanner;
//class Multiplication {
//    public static void main(String[] args) {
//        System.out.println("Welcome to calculate multiplication table:");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your number to finds its multiplication table:");
//        int num = input.nextInt();
//        int i = 1;
//        for( i = 1; i <= 10 ; i++ ){
//            System.out.println(" The result is " + i * num );
//        }
//
//    }
//}
