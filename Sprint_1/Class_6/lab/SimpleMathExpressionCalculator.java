import java.util.Scanner;

public class SimpleMathExpressionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for a simple math expression
        System.out.print("Enter a simple math expression (e.g., 4+4): ");
        String inputExpression = scanner.nextLine();

        // Extract operands and operator
        int operatorIndex = findOperatorIndex(inputExpression);
        int leftOperand = Integer.parseInt(inputExpression.substring(0, operatorIndex));
        char arithmeticOp = inputExpression.charAt(operatorIndex);
        int rightOperand = Integer.parseInt(inputExpression.substring(operatorIndex + 1));

        // Process the expression
        double result = processExpression(leftOperand, arithmeticOp, rightOperand);

        // Display the result
        System.out.println("Result: " + result);

        scanner.close();
    }

    // Function to find the index of the operator in the expression
    private static int findOperatorIndex(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (!Character.isDigit(expression.charAt(i))) {
                return i;
            }
        }
        return -1; // Operator not found
    }

    // Function to process the expression based on the operator
    private static double processExpression(int leftOperand, char arithmeticOp, int rightOperand) {
        switch (arithmeticOp) {
            case '+':
                return add(leftOperand, rightOperand);
            case '-':
                return subtract(leftOperand, rightOperand);
            case '*':
                return multiply(leftOperand, rightOperand);
            case '/':
                return divide(leftOperand, rightOperand);
            default:
                System.out.println("Unsupported operation.");
                return 0;
        }
    }

    // Custom functions for arithmetic operations
    private static double add(int a, int b) {
        return a + b;
    }

    private static double subtract(int a, int b) {
        return a - b;
    }

    private static double multiply(int a, int b) {
        return a * b;
    }

    private static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }
}
