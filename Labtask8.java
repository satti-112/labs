import java.util.Scanner;
public class Labtask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days,month,year;
        System.out.print("Enter the number of days=");
        days = input.nextInt();
        System.out.println("Enter the number of months=");
        month = input.nextInt();
        System.out.println("Enter the number of year=");
        year = input.nextInt();
        System.out.println("date you entered is " + month +"/"+ + days  +"/" + year+ ".");

        //buliding logic to ckech the magic day using and gate
        if(days==month)
        {
            if(days==year)
            {
                System.out.println("It is a magic date");
            }
        }

        else {
            System.out.println("day is not magic");
        }
    }
}
