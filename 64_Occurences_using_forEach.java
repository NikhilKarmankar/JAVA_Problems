import java.util.Scanner;
class Occurences_using_forEach {
    public static void main(String[] args) {
        System.out.println("Welcome to find occurences in arrray");
        Scanner input = new Scanner(System.in);
        int[] nums = Array_utility.inputArray();
        System.out.println("Now Enter the number you want to search:");
        int element = input.nextInt();
        int occ = countOccurences(nums,element);
        System.out.println("You element was found:" + occ + "");

    }
    public static int countOccurences(int[]nums, int element){
        int occ = 0;
        for(int num: nums){
            if(num == element){
                occ++;
            }
        }
      return occ;
    }
}
