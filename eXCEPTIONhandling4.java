import java.util.InputMismatchException;
import java.util.Scanner;

public class eXCEPTIONhandling4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arrylist = new int[10];
        int num;

        try{
            for(int i =0 ;i< arrylist.length;){
                System.out.println("Enter the value of array at index "+i);
                arrylist[i]= input.nextInt();
                System.out.println(" ");
                i++;
            }
            System.out.println("Enter an index to print the value of array at that index");
            num= input.nextInt();
            System.out.println(arrylist[num]);

        }catch (InputMismatchException e){
            System.out.println("Input mismatched");
            input.nextLine();
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index outofbound");

        }
input.close();
    }
}
