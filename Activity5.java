import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1,2 or 3:");
        number = input.nextInt();
        switch (number){
         case 1:
                System.out.println("You entered 1");
                break;
         case 2:
                System.out.println("You entered 2");
                break;
         case 3:
                System.out.println("You entered 3");
                break;
         default:
                System.out.println("THats not 1 2 or 3");

        }

    }

}
