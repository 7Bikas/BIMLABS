/*
4.	Write a program to create a file “nccs.txt” and write some content in it.
After this read the content of file and display the result. Use both byte stream 
and character stream. Also show different properties of file.
 */
package Labsheet8;
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        try{
            File f1= new File("nccs.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            //byesteam to read and write 
            FileOutputStream fos = new FileOutputStream(f1);
            String str= "Hollywood movie ";
            byte [] b1=str.getBytes();
            fos.write(b1);
            fos.close();
            //reading
            FileInputStream fis= new FileInputStream("nccs.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            fis.close();
            //characterstream to read and write on file 
            FileWriter fw = new FileWriter("nccs.txt");
            String str1 = "Do your work ";
            fw.write(str1);
            fw.close();
            //reading
            FileReader fr=  new FileReader("nccs.txt");//nccs.txt or f1(file pointer)
            int c;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
            fr.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
