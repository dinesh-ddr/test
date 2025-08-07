import java.util.Scanner; // Import the Scanner class to get user input

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the dividend: ");
        double dividend = input.nextDouble(); // Read the dividend as a double

        System.out.print("Enter the divisor: ");
        double divisor = input.nextDouble(); // Read the divisor as a double

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = dividend / divisor; // Perform the division
            System.out.println("The result of the division is: " + result);
        }

        input.close(); // Close the scanner to release resources
    }
}
