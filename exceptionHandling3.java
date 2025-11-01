import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptionHandling3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter first integer");
                int num1= input.nextInt();
                System.out.println("Enter second integer");
                int num2= input.nextInt();
                System.out.println("sum of num1 and num2 is"+(num1+num2));
                break;

            }catch (InputMismatchException ex){
                System.out.println("Enter an integer only");

                input.nextLine();
            }

        }

    }
}


