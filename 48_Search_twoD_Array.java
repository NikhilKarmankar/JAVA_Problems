import java.util.Scanner;
class Search_twoD_Array {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Search\n");
        Scanner input = new Scanner(System.in);
        int[][] numArr = Array_utility.input2DArray();
        System.out.println("Now enter the number you want to search:");
        int num = input.nextInt();
        boolean isFound = search(numArr,num);

        if(isFound){
            System.out.println(" Your number was found.");
        } else{
            System.out.println("Your number was not found.");
        }
    }

    public static boolean search(int[][] numArr , int num){
        int i = 0;
        while ( i < numArr.length){
            int j = 0;
            while ( j < numArr[i].length){
                if (numArr[i][j] == num){
                    return true ;

                }
                j++;
            }
            i++;
        }
        return false;
    }
}
