import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) throws IOException {

        File Obj = new File("data.txt");
        Scanner Reader = new Scanner(Obj);
        int [] arr = new int[10];
        int [] copyArr = new int[10];
        System.out.println("Array read from file is :");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = Reader.nextInt();
            System.out.print(arr[i] + " ");
        } Reader.close();
        System.out.println();
        System.out.println("Arranged array :");
        int temp;
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j= 0 ; j < arr.length - i- 1; j++){
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            copyArr[i] = arr[i];
            System.out.print(copyArr[i] + " ");
        }
    }
}
