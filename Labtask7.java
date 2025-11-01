import java.util.Scanner;
public class Labtask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length1, length2, width1, width2;//taking length and
        int area1, area2;//both rectangles areas
        System.out.println("Enter the lenght of 1 rectangle =");
        length1 = input.nextInt();
        System.out.println("Enter the width of 1 rectangle =");
        width1 = input.nextInt();
        area1 = length1 * width1;
        System.out.println("area of ist raectangle" + area1);
        System.out.println("Enter the lenght of 2 rectangle =");
        length2 = input.nextInt();
        System.out.println("Enter the width of 2 rectangle =");
        width2 = input.nextInt();
        area2 = length2 * width2;
        System.out.println("area of ist raectangle" + area2);
        if (area1 == area2) {
            System.out.println("both rectangles area is same");
        } else {
            System.out.println("both triangles have different areas");


            input.close();


        }
    }
}
