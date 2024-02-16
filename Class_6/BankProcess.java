import java.util.Scanner;

public class BankProcess {
    public static void main(String[] args){
        //Scanner for user input
        Scanner userScanner = new Scanner(System.in);

        // Get user defined data
        System.out.println("Please input the value of your loan:");
        int loanAmount = userScanner.nextInt();

        double intrestCost = calcIntrestAmount(loanAmount);     // Call a function!

        System.out.println("A loan of $" + String.valueOf(loanAmount) + " with 3.75% APR would cost $" + String.valueOf(intrestCost));

        userScanner.close();
    }

    public static double calcIntrestAmount(int loan){
        return loan * 1.0375d;
    }
}


