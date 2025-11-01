import java.util.*;
import java.io.*;
public class Task1FileHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arry = new int[10];
        try(PrintWriter pw = new PrintWriter(new File("array.txt"))){
            for(int i=0;i< arry.length;i++){
                arry[i]= sc.nextInt();
                pw.println(arry[i]);

            }


        }catch (IOException ex){
            System.out.println("exception in input");

        }
        sc.close();

    }
}
