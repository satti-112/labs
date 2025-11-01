import java.util.Scanner;
public class LabThreeTASK2 {
    public static void main(String[] args) {

                //n is number of students and k is numbers of apples
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of students which is n: ");
                int N = scanner.nextInt();
                System.out.print("Enter the number of apples which is k :");
                int K = scanner.nextInt();
                /*TO check the apples each student can get .we divide the number of students to number of apples and
                remaning apples should be checked by modulus */

                int applesPerStudent = K / N;
                int applesInBasket = K % N;
                System.out.println(applesPerStudent + " " + applesInBasket);
            }
        }




