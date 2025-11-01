import java.io.*;

public class Activity3FileHandling {
    public static void main(String[] args) {
        int rno =101;
        String name = "Muzaffar";
        int marks = 88;
        try(PrintWriter wr = new PrintWriter("record.text")){
            wr.println(rno);
            wr.println(name);
            wr.println(marks);
            System.out.println("Sussfully written ");



        }catch (IOException e){
            System.out.println("Input out exception");
        }

    }
}
