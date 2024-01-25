
package Orchid;

import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) {
        try{
            File f1= new File("first.txt");
            File f2= new File("final.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            String s="I am a programmer .";
            //writing in to file 
            FileWriter fw= new FileWriter(f1);
            fw.write(s);
            System.out.println("Written sucessfully");
            fw.close();
            FileReader fr= new FileReader(f1);
            FileWriter fw1= new FileWriter (f2);
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
                fw1.write(i);
            }
            fw1.close();
            
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
