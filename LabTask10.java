import java.util.Scanner;
public class LabTask10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of books you purchased =");
        int no_Of_Books;
        no_Of_Books = input.nextInt();
        if (no_Of_Books >= 0) {       //if number is negative it will not execute
            switch (no_Of_Books) {    //statments for all cases
                case 0:
                    System.out.println("You have earned 0 points");
                    break;
                case 1:
                    System.out.println("You have earned 5 points");
                    break;
                case 2:
                    System.out.println("You have earned 15 points");
                case 3:
                    System.out.println("You have earned 30 points");
                    break;
                case 4:
                    System.out.println("You have earned 60 points");
                    break;
                default:
                    System.out.println("you have earned 60 points");
            }


        }
    }
}
