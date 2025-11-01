import java.util.Scanner;
public class LabThreeTASk8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        //initializing 0 to some so no garbage value is stored in sum
        int sum = 0;
//using while to run program until number is greater than 0,to overcome logic error
        while (number > 0) {
/*
LOGIC CHECK,459
SUM = 0,
459 %10=9
SUM=9+0=9
NUMBER=459/10=45
45 % 10 =5
SUM = 5 + 9=14
NUMBER=45/10=4
4 % 10= 4
SUM =4+14=18
NUMBER =4/10=0
WHILE (NUMBER>0)FALSE



*/
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sum);
    }
}





