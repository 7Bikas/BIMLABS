/*6.	Write a program to create a file “tu.txt” and write some text on it.
Now read a content from “tu.text”, display them and count the number of characters and print it. 
 */
package Labsheet8;
import java.io.*;
public class Qn6 {
    public static void main(String[] args) {
        try{
            File f1= new File("tu.txt");
        if(!f1.exists()){
            f1.createNewFile();
        }
          FileWriter fw= new FileWriter(f1);
          String str="Welcome to nepal .!";
          fw.write(str);
          fw.close();
          FileReader fr = new FileReader(f1);
          int i;
          int c=0;
          while((i=fr.read())!=-1){
              System.out.print((char)i);
              c++;
          }
            System.out.println("No of character is :"+c);
          fr.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
