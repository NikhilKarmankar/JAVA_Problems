import java.util.Scanner;

 class Delete_from_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array
        System.out.println("Original array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Get the element to delete
        System.out.print("Enter the index of the element to delete (0-based): ");
        int indexToDelete = scanner.nextInt();

        // Check if the index is valid
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Invalid index.");
        } else {
            // Create a new array with one less element
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != indexToDelete) {
                    newArray[j++] = array[i];
                }
            }

            // Display the new array
            System.out.println("Array after deletion:");
            for (int i : newArray) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
