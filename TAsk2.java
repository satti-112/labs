import  java.util.*;
import  java.io.*;

public class TAsk2 {
    public static void main(String[] args) {
        int sum=0;
        try{
            File file= new File("data.txt");
            PrintWriter pw = new PrintWriter("wrongdata");
            int linenumber=0;

            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                linenumber++;


                String line = sc.nextLine().trim();
                try{
                    int number= Integer.parseInt(line);
                    sum+=number;
                }catch (NumberFormatException e){
                    pw.println("line "+linenumber+"invalid integer "+line);
                }


            }
            System.out.println("Total sum of valid entites is "+ sum);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
