//import java .util.Scanner;
//class Array_sum_average {
//    public static void main(String[] args) {
//        System.out.println("Welcome to find sum and average of array");
//        Scanner input = new Scanner(System.in);
//        System.out.println("please enter the number of the element:");
//        int size = input.nextInt();
//        int[]num = new int[size];
//        int i = 0;
//        while(i < size){
//            System.out.println("please enter element no " + (i+1) + ":");
//            num[i]= input.nextInt();
//            i++;
//
//        }
//        long sum = sum(num);
//        int avg = average(num);
//        System.out.println("sum of the number is : " + sum);
//        System.out.println("average of the number is : " + avg);
//        input.close();
//
//    }
//    public static  long sum(int[] numArray){
//        long sum = 0 ;
//        int i = 0 ;
//        while ( i < numArray.length){
//            sum = sum + numArray[i];
//        }
//        return sum;
//    }
//    public static int average(int[] numArray){
//        long sum = sum(numArray);
//        return (int) ( sum / numArray.length);
//    }
//}

import java.util.Scanner;

class Array_sum_average {
    public static void main(String[] args) {
        System.out.println("Welcome to find the sum and average of an array");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of elements:");
        int size = input.nextInt();

        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter element no " + (i + 1) + ":");
            num[i] = input.nextInt();
        }

        long sum = sum(num);
        double avg = average(num);

        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + avg);

        input.close(); // Close Scanner
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public static double average(int[] numArray) {
        long sum = sum(numArray);
        return (double) sum / numArray.length; // Use double for precision
    }
}
