import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling2 {
    public static void main(String[] args) {
 while (true) {


     Scanner inp = new Scanner(System.in);
     System.out.println("enter an integer to find its factorial");
     try {
         int num = inp.nextInt();
         System.out.println(factorial(num));
         break;
     } catch (InputMismatchException ex) {
         System.out.println("Enter an integer");

     }

 }


    }

    public static int factorial(int n){
        int factorial=1;
        for(int i=n ;i>=1;i--){
            factorial*=i;
        }
       return factorial;
    }

}
