import java.util.Scanner;
class Sum_positive {
    public static void main(String[] args) {
        System.out.println("Welcome to add the positive numbers:");
        int[] numArr = Array_utility.inputArray();

        int sum =0;
        for (int num : numArr){
            if(num < 0){
                continue;
            }
            sum = sum + num;
        }
        System.out.println("The sum of positive numbers is :" + sum);

    }
}
