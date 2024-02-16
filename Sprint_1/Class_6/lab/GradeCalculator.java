import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for total number of questions
        System.out.print("Enter the total number of questions in the test: ");
        int totalQuestions = scanner.nextInt();

        // Prompt for number of correct answers
        System.out.print("Enter the number of questions answered correctly: ");
        int correctAnswers = scanner.nextInt();

        // Calculate the grade percentage
        double gradePercentage = ((double) correctAnswers / totalQuestions) * 100;

        // Determine and print the grade
        System.out.println("Grade: " + determineGrade(gradePercentage));

        scanner.close();
    }

    // Function to determine the grade based on percentage
    public static String determineGrade(double gradePercentage) {
        if (gradePercentage >= 90) {
            return "A";
        } else if (gradePercentage >= 80) {
            return "B";
        } else if (gradePercentage >= 70) {
            return "C";
        } else if (gradePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
