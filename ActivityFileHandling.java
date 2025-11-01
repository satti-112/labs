import java.util.*;
import java.io.*;
public class ActivityFileHandling {
    public static void main(String[] args) throws  IOException {
        InputStreamReader cin=null;

        try{
            cin = new InputStreamReader(System.in);

            File file = new File("character.text");

            OutputStream op = new FileOutputStream(file);
            System.out.println("Enter the characters to write in file and than read later ,press q for exit");
            char c;
            do{
                c =(char) cin.read();
                op.write(c);

            }while (c!='q');
         op.close();
            System.out.println("The given data is as below");
         InputStream is = new FileInputStream(file);
         int size= is.available();
         for (int  i =0;i<size; i++){
             System.out.print((char) is.read()+" ");
         }
         is.close();
        }
        catch ( Exception e){
            System.out.println("Exception occured");
        }
    }

}
