import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) throws FileNotFoundException {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        FileOutputStream output = new FileOutputStream("data.txt");
        PrintWriter writer = new PrintWriter(output);
        System.out.println("Enter the numbers (can enter 10 numbers only):");
        for (int i : arr){
            arr[i] = input.nextInt();
            writer.print(arr[i] + " ");
        }
        writer.close();
    }
}
