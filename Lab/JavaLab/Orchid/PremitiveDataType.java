
package Orchid;
import java.io.*;

public class PremitiveDataType {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("num.txt");
            DataOutputStream dos= new DataOutputStream(fos);
            dos.writeInt(2);
            dos.writeFloat(2.3f);
            dos.writeDouble(4.99);
            dos.writeBoolean(true);
            dos.writeUTF("Bikas");
            System.out.println("File written sucessfully");
            FileInputStream fis= new FileInputStream("num.txt");
            DataInputStream dis= new DataInputStream(fis);
            System.out.println("Integer is "+dis.readInt());
            System.out.println("Boolean is :"+dis.readBoolean());
            System.out.println("Double is :"+ dis.readDouble());
            System.out.println("Float is :"+dis.readFloat());
            System.out.println("String  is :"+dis.readUTF());
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
