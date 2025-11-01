import java.util.Scanner;
public class labtask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //..finding smaller out of two numbers using binomial expression
        int x = 4, y = 5 , z = 6 , a = 3;
        System.out.println("x < y " + (x < y) + "  x is smaller than y "  );
        System.out.println("y < z " + (y < z) + "  y is smaller than z"  );
        //..finding the smaller number using if else
        if(x<y) {

            System.out.println("x is smalller than y");
        }
        else {
            System.out.println("y is smaller than x");
        }
 // For the given integer X print 1 if it's positive, -1 if it's negative, or 0 if it's equal to 0
        System.out.println("Enter an integer");
        int num1;
        num1=input.nextInt();
        if(x>0){
            System.out.println("1");//prints 1 if number is positive
        }
        else if (x<0) {
            System.out.println("-1");//prints -1 if it is negative

        }
        else {
            System.out.println("0");//prints 0 if it is equal to 0
        }
//prints the minimum of there numbers

        if(x < y && x < z){
            System.out.println("x is smaller");

        }
        else if (y < z&&y < x) {
            System.out.println("y is smaller");

        }
        else {
            System.out.println("z is smaller");
        }
    }
}
