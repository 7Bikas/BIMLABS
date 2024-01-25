package practice;
    import java.io.*;

public class FILEreadandWrite {
    public static void main(String[] args) {
        try{
             FileInputStream fis =new FileInputStream("text.txt");
            FileOutputStream fos= new FileOutputStream("best.txt");
            int i;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
            System.out.println("Written sucessfully ");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}