
package Orchid;
import java.io.*;
public class QN17 {
    public static void main(String[] args) {
        try{
            File f1= new File ("file1.txt");
            if(!f1.exists()){
               f1.createNewFile();
            }
            FileOutputStream fos= new FileOutputStream(f1);
            String str= "I am bikas Bhatta";
            byte[] b1=str.getBytes();
            fos.write(b1);
            fos.close();
            //reading data from file using byte stream
            FileInputStream fis= new FileInputStream(f1);
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
        }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
