import java.io.*;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String word = input.nextLine().toLowerCase();

        try (Scanner fileScanner = new Scanner(new File("paragraph.txt"))) {
            int lineNumber = 0;
            boolean found = false;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineNumber++;

                if (line.toLowerCase().contains(word)) {
                    System.out.println("Found on line: " + lineNumber);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("The word \"" + word + "\" was not found in the file.");
            }

        } catch (IOException e) {
            System.out.println("File not found or unreadable.");
        }
    }
}
