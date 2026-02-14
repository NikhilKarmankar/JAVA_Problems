import java.util.Scanner;
class Number_of_occurrences {
    public static void main(String[] args) {
        System.out.println("Welcome to find number of Occurrences:");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number of elements in the Array:");
        int size = input.nextInt();

        int []num = new int[size];
        for(int i = 0; i < size ; i++){
            System.out.println("Please enter your number " + (i+1) + ":" );
            num [i] = input.nextInt();
        }
        System.out.println("Now enter the number you want to find:");
        int find = input.nextInt();
        int occurrences = noOfOccurences(num,find);
        System.out.println("Your element was found " + occurrences + " times in the Array:");

    }



    public static int noOfOccurences( int[] num, int find){
        int occ = 0;
        int i = 0;
        while(i < num.length){
            if(num[i] == find){
                occ++;

            }
            i++;
        }
        return occ ;
    }

}
