import java.util.*;
import java.io.*;

public class task3FileHAndling {

    public static void main(String[] args) throws Exception {
        int[] arry = new int[10];
        try (Scanner sc = new Scanner(new File("array.txt"))) {
            int i = 0;
            while (sc.hasNextInt() && i < arry.length) {
                arry[i] = sc.nextInt();
                i++;
            }

            int count = i;
            int index = 0;
            int[] arraynew = new int[count];

            for (int j = 0; j < count; j++) {
                if (!isPrime(arry[j])) {
                    arraynew[index] = arry[j];
                    index++;
                }
            }

            // ✅ Move this OUTSIDE the loop
            System.out.println("Array after removing prime numbers:");
            for (int k = 0; k < index; k++) {
                System.out.print(arraynew[k] + " ");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
