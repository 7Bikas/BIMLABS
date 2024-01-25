
package Orchid;
import java.io.*;
import java.util.*;
public class ArrayIndex {
    public static void main(String[] args) {
        try{
            File f1= new File("hari.txt");
            File f2= new File("bikas.txt");
            if(! f1.exists()){
            f1.createNewFile();
        }
         FileInputStream fis= new FileInputStream(f1);
         FileOutputStream fos= new FileOutputStream(f2);
         int i;
         while((i=fis.read())!=-1){
             /*to display 
             */
             System.out.print((char)i);
             
          fos.write(i);
          
        }
         fis.close();
         fos.close();
            System.out.println("Written sucessfully");
        }catch(IOException io){
            System.out.println(io);
        }
    }
    
}
