import java.util.Scanner; // Import the Scanner class to get user input
//sub program

public class SubtractionProgram {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble(); // Read the first number

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble(); // Read the second number

        // Perform subtraction
        double result = num1 - num2;

        // Display the result
        System.out.println("The difference is: " + result);

        input.close(); // Close the scanner to release resources
    }
}
