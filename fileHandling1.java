import java.io.*;

public class fileHandling1 {
    public static void main(String[] args) {
   try{
       char[] ch ={'j','a','v','a','i'};
       OutputStream os= new FileOutputStream("test.text");
       for(int i =0 ;i<=ch.length;i++){
           os.write(ch[i]);

       }
       os.close();
       InputStream im =new FileInputStream("test.text");
       int size =im.available();
       for(int i =0 ;i<=size;i++){
           System.out.println((char)im.read()+ " ");
       }

   }catch (Exception e){

   }
    }
}
