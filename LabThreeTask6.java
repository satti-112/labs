import java.util.Scanner;
public class LabThreeTask6 {
    public static void main(String[] args) {
            //Program about managment of monthly income of a person
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your hourly pay rate: ");
            double payRate = scanner.nextDouble();

            System.out.print("Enter the number of hours you worked each week: ");
            double hoursPerWeek = scanner.nextDouble();
            //to calculate total income we wil muliply pay rate with hours and there are five working weeks
            double totalIncome = payRate * hoursPerWeek * 5;
            //calculating tax on total income which is 0.14
            double taxAmount = totalIncome * 0.14;
            //remaning amount after tax
            double incomeAfterTax = totalIncome - taxAmount;
            //as in statement it is told that 10% is spent on shoping
            double clothesAndAccessories = incomeAfterTax * 0.10;
            //1% spent to buy school supplies
            double schoolSupplies = incomeAfterTax * 0.01;
            //subracting all spendings from  salary check remaning salary
            double remainingMoney = incomeAfterTax - clothesAndAccessories - schoolSupplies;
            //other necessary expenditures
            double savingsBonds = remainingMoney * 0.25;
            double parentsBonds = savingsBonds * 0.50;
            //print statments on output console
            System.out.println("Your income before tax: $" + totalIncome);
            System.out.println("Your income after tax: $" + incomeAfterTax);
            System.out.println("Money spent on clothes and accessories: $" + clothesAndAccessories);
            System.out.println("Money spent on school supplies: $" + schoolSupplies);
            System.out.println("Money spent to buy savings bonds: $" + savingsBonds);
            System.out.println("Money your parents spend on additional savings bonds: $" + parentsBonds);
        }
    }
