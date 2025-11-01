import java.io.File;
import java.util.Scanner;

public class labtask7 {
    public static void main(String[] args) {
        int words =0;
        int lines =0;
        int noOfCharacters =0;

        try(Scanner sc = new Scanner(new File("paragraph.text"))){
            while (sc.hasNextLine()){

                lines++;
                String line= sc.nextLine();
                noOfCharacters+=line.length();
                String[] word =line.trim().split("\\s+");
                if(!line.trim().isEmpty()){
                    words+=word.length;
                }


            }

            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + noOfCharacters);




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
