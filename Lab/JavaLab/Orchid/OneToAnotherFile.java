
package Orchid;

import java.io.*;

public class OneToAnotherFile {
    public static void main(String[] args) {
        
        
        try{
            File f1= new File("text.txt");
        File f2= new File ("best.txt");
        if(!f1.exists()){
            f1.createNewFile();
        }
            FileInputStream fis=new FileInputStream(f1);
            FileOutputStream fos= new FileOutputStream(f2);
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
                fos.write(i);
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
