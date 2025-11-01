import java.util.Scanner;
public class LabThreeTask7 {
    public static void main(String[] args) {
            //simple program on claculation of tickets sold in stadium and total income generated
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of Class A tickets sold: ");
            int classA = scanner.nextInt();

            System.out.print("Enter the number of Class B tickets sold: ");
            int classB = scanner.nextInt();

            System.out.print("Enter the number of Class C tickets sold: ");
            int classC = scanner.nextInt();

            System.out.print("Enter the number of Class D tickets sold: ");
            int classD = scanner.nextInt();

            int incomeA = classA * 20;
            int incomeB = classB * 15;
            int incomeC = classC * 10;
            int incomeD = classD * 5;

            int totalIncome = incomeA + incomeB + incomeC + incomeD;

            System.out.println("Total income generated: $" + totalIncome);
            System.out.println("Income from Class A tickets: $" + incomeA);
            System.out.println("Income from Class B tickets: $" + incomeB);
            System.out.println("Income from Class C tickets: $" + incomeC);
            System.out.println("Income from Class D tickets: $" + incomeD);
        }
    }

