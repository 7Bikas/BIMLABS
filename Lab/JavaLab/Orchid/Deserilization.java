
package Orchid;
import java.io.*;

public class Deserilization {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            File f1= new File ("seri.txt");
            FileInputStream fis = new FileInputStream("seri.txt");
            ObjectInputStream ois= new ObjectInputStream (fis);
            Employee e2= (Employee)ois.readObject();
            e2.display();
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
