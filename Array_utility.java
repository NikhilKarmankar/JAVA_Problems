import java.util.Scanner;

public class Array_utility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements:");
        int size = input.nextInt();

        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Please enter element no " + (i + 1) + ":");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }

    public static int[][] input2DArray() { // Corrected return type to int[][]
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns:");
        int columns = input.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.println("Please enter element for row " + (i + 1) + ", column " + (j + 1) + ":");
                numArray[i][j] = input.nextInt(); // Fixed input assignment
                j++;
            }
            i++;
        }
        return numArray; // Corrected return statement
    }

    public static void displayArray(int[] num) {
        int i = 0;
        while (i < num.length) {
            System.out.print(num[i] + " "); // Changed to print instead of println
            i++;
        }
        System.out.println();
    }

    public static void display2DArray(int[][] numArray) { // Added method for 2D array display
        for (int[] row : numArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = inputArray();
        System.out.println("1D Array:");
        displayArray(array);

        int[][] array2D = input2DArray();
        System.out.println("2D Array:");
        display2DArray(array2D);
    }
}
