import java.util.Scanner;
public class LabThreeTASK1 {
    public static void main(String[] args) {

        //program about conversion of dollor to cents ,quarters,dimes,nickles,pennies
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the amount (like 11.56): ");
        //taking input from user
                 double amount = input.nextDouble();
        // rounding off to get precise input so that 2.999999999999 can be written as 3
                 double cents = Math.round(amount * 100);

        //one dollar is 100 cents
                double dollars = cents / 100;
        //after converting cents to dollars ckecking remaining cents
                cents = cents % 100;
        //for quarters dividing remaining cents with 25
                double quarters = cents / 25;
        //checking how many cents are remaining after taking out quarters
                cents = cents % 25;
        //now checking how many dimes are there in remaining cents
                double dimes = cents / 10;

                cents = cents % 10;
        //then taking out nickels from cents if there are any remaining
                double nickels = cents / 5;
                cents = cents % 5;
        //lastly taking out pennies from remmaining cents
                double pennies = cents;
                System.out.printf("Amount: $%.2f\n", amount);
                System.out.println("Dollars: " + dollars);
                System.out.println("Quarters: " + quarters);
                System.out.println("Dimes: " + dimes);
                System.out.println("Nickels: " + nickels);
                System.out.println("Pennies: " + pennies);
                input.close();
            }
        }



