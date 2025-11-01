import java.util.Scanner;
public class LabThreeTask3 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                //for reading number All students in class A
                System.out.print("Enter number of students in class A: ");
                int a = scanner.nextInt();
                //for reading number All students in class B
                System.out.print("Enter number of students in class B: ");
                int b = scanner.nextInt();
                //for reading number All students in class C

                System.out.print("Enter number of students in class C: ");
                int c = scanner.nextInt();
                //per desk is for 2 students
                //so if   in case if one student is left alone .so one more desk will be needed


                int desksA = (a +1)  /  2;
                int desksB = (b +1)  /  2;
                int desksC = (c +1)  /  2;


                int totalDesks = desksA + desksB + desksC;


                System.out.println("Total number of desks required: " + totalDesks);
            }
        }

