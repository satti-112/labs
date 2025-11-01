import java.util.Scanner;
public class exceotionHandling1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a,b,choice;
        do {
            System.out.println("Enter first number");
            a = input.nextInt();
            System.out.println("ENter seocnd number");
            b = input.nextInt();
            System.out.println("Enter the choice");
            choice = input.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Sum of a + b is" + (a + b));
                        break;
                    case 2:
                        System.out.println("subtraction of a - b is" + (a - b));
                        break;
                    case 3:
                        System.out.println("Multiplication of a * b is" + (a * b));
                        break;
                    case 4:
                        System.out.println("a/b is " + (a / b));
                        break;

                    case 5:
                        break;
                    default:
                        System.out.println("Invalid choice");
                             }
                }catch(ArithmeticException ex){
                System.out.println("divisor can not be zero");

                }

                }while (choice != 5);

        }
    }

