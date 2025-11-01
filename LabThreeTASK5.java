import java.util.Scanner;
public class LabThreeTASK5 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //program about managing milk business calculation

            System.out.print("Enter the total amount of milk produced (in liters): ");
            //taking input from usere
            double totalMilk = scanner.nextDouble();

            //3 constant which are given in program
            //using final keyword because these values will not change
            //using float due to decimal values
            final float CARTON_CAPACITY = 3.78f;
            final float COST_PER_LITER = 0.38f;
            final float PROFIT_PER_CARTON = 0.27f;

            //using math.round function to get the precise value because cotton bags can not be counted in points

            int cartonsNeeded = (int) Math.round(totalMilk / CARTON_CAPACITY);
            //finding production cost
            double productionCost = totalMilk * COST_PER_LITER;
            //also finding total profit
            double totalProfit = cartonsNeeded * PROFIT_PER_CARTON;
           //for output
            System.out.println(" cartoons Needed =     "+ cartonsNeeded);
            //used formating method ,using printf and %8 allocates 8 spaces for valiable value
            //meanwhile in %8.2f ,2 refers to digits included after decimal point and f for floting values
            System.out.printf(" production cost  =%8.2f\n", productionCost);
            //same formating is used as used in above
            System.out.printf(" totalProfit      =%8.2f\n", totalProfit);
        }
    }


