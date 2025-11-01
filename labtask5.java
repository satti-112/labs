import java.util.Scanner;
public class labtask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 number:");
        int num1=input.nextInt();
        System.out.println("enter 2 number:");
        int num2=input.nextInt();
        System.out.println("enter 3 number:");
        int num3=input.nextInt();
        System.out.println("Sample input:"+num1+num2+num3);

     if( (num1 == num2) && (num2 == num3) )   {
         System.out.println("output :3");
     }
     else if ( (num1 == num2)|| (num2== num3)) {
         System.out.println("output :2");
     }
     else {
         System.out.println("output :0");
     }
    }
}
