import java.util.Scanner;

class StudentScore {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the student's score
        System.out.println("Enter the student's score (0-100):");
        int score = input.nextInt();

        // Use the ternary operator to categorize the score
        String category = (score > 80) ? "High" :
                (score >= 50) ? "Moderate" :
                        (score >= 0) ? "Low" :
                                "Invalid score";

        // Display the category
        if (!category.equals("Invalid score")) {
            System.out.println("The student's score category is: " + category);
        } else {
            System.out.println("Error: Please enter a valid score between 0 and 100.");
        }
    }
}
