import java .util.Scanner;
class Multiplication_table_using_for {
     public static void main(String[] args) {
        System.out.println("Welcome to print multiplication table using for loop:");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number you want to print table:");
        int num = input.nextInt();
        print_Multi_Table(num);


    }
    public static void print_Multi_Table(int num){
        for(int i =1; i<=10 ; i++){
            System.out.println(num + "X" + i + "=" + (num *i) );
        }

    }

}
