import java.sql.SQLOutput;
import java.util.Scanner;
public class labtask6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number;
        System.out.println("enter a number between 1 to 10");
        number=input.nextInt();
        if(number >= 1 && number <= 10)
        {
            switch (number)
            {
                case 1:
                    System.out.println("I");
                break;
                case 2:
                    System.out.println("II");
                break;
                case 3:
                    System.out.println("III");
                break;
                case 4:
                    System.out.println("IV");
                break;
                case 5:
                    System.out.println("V");
                break;
                case 6:
                    System.out.println("VI");
                break;
                case 7:
                    System.out.println("VII");
                break;
                case 8:
                    System.out.println("VIII");
                break;
                case 9:
                    System.out.println("IX");
                break;
                case 10:
                    System.out.println("X");
                break;



            }

        }
        else{
            System.out.println("Error ,number is not valid");
        }

    }
}
