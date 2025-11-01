import java.util.Scanner;
public class LabThreeTASK4 {
    public static void main(String[] args) {


                // Create a scanner object to read input
                Scanner scanner = new Scanner(System.in);

                // Step 1: Read the number of minutes since midnight (N)
                System.out.print("Enter the number of minutes since midnight: ");
                int N = scanner.nextInt();

                // Step 2: Calculate the number of hours
                int hours = N / 60; // Divide by 60 to get the full hours

                // Step 3: Calculate the remaining minutes
                int minutes = N % 60; // Use modulus to get the remainder of minutes

                // Step 4: Print the result
                System.out.println(hours + " " + minutes);
            }
        }


