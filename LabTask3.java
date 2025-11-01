import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {

        // INPUT
        // Creating Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        int size;

        // Asking the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        size = input.nextInt();

        // Declaring two arrays: one for original values, one for reversed
        int[] originalArray = new int[size];
        int[] reversedArray = new int[size];

        // Taking input values for the original array from the user
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = input.nextInt();
        }

        // PROCESSING
        // Copying elements from originalArray to reversedArray in reverse order
        for (int i = 0; i < size; i++) {
            reversedArray[i] = originalArray[size - 1 - i];
        }

        // OUTPUT
        // Displaying the original array elements
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(originalArray[i] + " ");
        }

        // Displaying the reversed array elements
        System.out.println("\nReversed Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
