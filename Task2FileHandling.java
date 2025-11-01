import java.util.*;
import java.io.*;
public class Task2FileHandling {
    public static void main(String[] args) {
        int[] arry =new int[10];
       try(Scanner sc = new Scanner( new File("array.txt"))) {


           for(int i=0;i< arry.length;i++) {
                arry[i] = sc.nextInt();



           }
       }catch (IOException  | ArrayIndexOutOfBoundsException e){
           System.out.println("Io exception occured or array index outof bound");
       }
        try(Scanner sc = new Scanner( new File("array.txt"))) {
            for(int i =0;i< arry.length-1;i++){
                for(int j=i+1;j< arry.length;j++){
                    int temp=0;
                    if (arry[i]>arry[j]) {
                         temp= arry[i] ;
                        arry[i]=arry[j];
                        arry[j]=temp;

                    }



                }
            }
            for(int i=0;i< arry.length;i++) {
                System.out.print(arry[i] +" ");


            }


        }catch (IOException e){
            System.out.println("Io exception occured");
        }


    }
}
