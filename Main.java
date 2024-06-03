import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principalAmount = 0.0;
        double rate = 0.0;
        double time = 0.0;

        try {
            // Prompt user to input principal amount
            System.out.print("Enter the principal amount: ");
            principalAmount = scanner.nextDouble();

            // Prompt user to input rate of interest
            System.out.print("Enter the rate of interest (as a percentage): ");
            rate = scanner.nextDouble();

            // Prompt user to input time period in years
            System.out.print("Enter the time period in years: ");
            time = scanner.nextDouble();
        } catch (InputMismatchException e) {
            // Handle non-numeric input
            System.out.println("Invalid input. Please enter numeric values only.");
            scanner.close();
            return;
        }

        // Validate input values
        if (principalAmount < 0 || rate < 0 || time < 0) {
            System.out.println("Principal amount, rate of interest, and time period must be non-negative.");
        } else {
            // Calculate interest
            double interest = calculateInterest(principalAmount, rate, time);
            // Display the calculated interest
            System.out.printf("The calculated interest is: %.2f%n", interest);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate interest
    private static double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
