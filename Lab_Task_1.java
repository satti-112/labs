import java.util.Scanner;

public class Lab_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        // Input for first number
        while (!validInput) {
            System.out.print("Enter first integer: ");
            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("You have entered an invalid input, type integers only.");
                scanner.next(); // Clear the invalid input
            }
        }

        validInput = false; // Reset for second number

        // Input for second number
        while (!validInput) {
            System.out.print("Enter second integer: ");
            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("You have entered an invalid input, type integers only.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Display the sum
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
