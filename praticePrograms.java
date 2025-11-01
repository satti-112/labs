import java.util.Scanner;

public class praticePrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // 0 for heads, 1 for tails
        int coin = (int)(Math.random() * 2);

        // Prompt user for a guess
        System.out.print("Guess heads or tails (0 for heads, 1 for tails): ");
        int guess = input.nextInt();

        // Check the guess
        if (guess == coin) {
            System.out.println("Correct! It was " + (coin == 0 ? "heads." : "tails."));
        } else {
            System.out.println("Incorrect. It was " + (coin == 0 ? "heads." : "tails."));
        }

        input.close();
    }
}
