/*7.	Write a program to write primitive type in file “emp.txt” and after that display the content of file.*/
package Labsheet8;
import java.io.*;
public class Qn7 {
    public static void main(String[] args) {
        int a=100;
        float f=10.5f;
        double d=2.33;
        boolean b=true;
        String s="Rohan";
        try{
            File f1= new  File("emp.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            FileOutputStream fos= new FileOutputStream(f1);
            DataOutputStream dos= new DataOutputStream(fos);//primitive vaya yo lakhni 
            dos.writeInt(a);
            dos.writeFloat(f);
            dos.writeBoolean(b);
            dos.writeDouble(d);
            dos.writeUTF(s);
            dos.close();
            fos.close();
            FileInputStream fis= new FileInputStream (f1);
            DataInputStream ds =new DataInputStream (fis);
            System.out.println("Integer data is :"+ds.readInt());
            System.out.println("Float data is :"+ds.readFloat());
            System.out.println("Boolean data is :"+ds.readBoolean());
            System.out.println("Double data is :"+ds.readDouble());
            System.out.println("String data is :"+ds.readUTF());
            ds.close();
            fis.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
