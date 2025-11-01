import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File Obj = new File("data.txt");
        Scanner counter = new Scanner(Obj);
        int count = 0;
        while (counter.hasNext()) {
            counter.nextInt();
            count++;
        }counter.close();
        int[] arr = new int[count];

        Scanner Reader = new Scanner(Obj);
        count = 0;
        while (Reader.hasNext()){
            arr[count] = Reader.nextInt();
            count++;
        }Reader.close();
        PrintWriter output = new PrintWriter(Obj);
        for (int i = 0 ; i < arr.length ; i++){
            if (!isPrime(arr[i])){
                output.print(arr[i] + " ");
            }
        }output.close();
    }
}
