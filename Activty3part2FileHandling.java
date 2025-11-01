import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Activty3part2FileHandling {
    public static void main(String[] args) {
        try(   Scanner sc =new Scanner(new File("record.text"))){

//            File file = new File("record.text");
//            Scanner sc =new Scanner(file);
            while (sc.hasNext()){
                int rno= sc.nextInt();
                System.out.println("R.no = "+rno);
                String name =sc.next();
                System.out.println("Name="+name);
                int marks = sc.nextInt();
                System.out.println("marks = "+ marks);
            }

        }catch (IOException e){
            System.out.println("IO exceptrion occured");
        }
        catch (InputMismatchException ex){
            System.out.println("Imput mismatched occured");
        }


    }
}
