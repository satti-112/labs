import java.util.Scanner;
public class Labtask9 {
    //program for making 1 dollors by taking input from users like pennies,cents,nickels,quarters;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pennies,nickels,quarters,dimes;
        System.out.println("Enter the amount in pennies");
        pennies = input.nextInt();
        System.out.println("Enter the amount in  dimes");
        dimes= input.nextInt();
        System.out.println("Enter the amount in nickels");
        nickels = input.nextInt();
        System.out.println("Enter the amount in quarters");
        quarters = input.nextInt();

        //logic for making 1 dollar
        //Convert all units in cents
        //100 centers makes 1 dollar
        //use of else if to print three statements
        int total_cents = (nickels * 1 )+ (pennies * 5 )  +(dimes * 10 )+ (quarters * 25) ;
        if(total_cents ==100){
            System.out.println("you are correct");
        }
        else if (total_cents<100) {
            System.out.println("entered amount is less than 1 dollar");


        }
        else {
            System.out.println("the amount you entered is greater");
        }


    }
}
