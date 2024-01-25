
package practice;
import java.io.*;
class Square implements Serializable{
  private int length;
public Square (int length){
    this.length=length;
    }  
    public void calcArea(){
        System.out.println("Area is : "+(length*length));
    }
    public int calcPerimeter (){
        return(4*length);
    }
}
public class SrializableDemo {
    public static void main(String[] args) {
        try{
            Square s1= new Square(300);
            //serialization : inserting object in to file 
            File f1= new File("sq1.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            System.out.println("Hello Everyone.");
                FileOutputStream fos= new FileOutputStream(f1);
                ObjectOutputStream oos= new ObjectOutputStream(fos);
                oos.writeObject(s1);
                System.out.println("Object is written in a file ");
                fos.close();
                oos.close();
                //deseriazable
                FileInputStream fis= new FileInputStream(f1);
                ObjectInputStream ois= new ObjectInputStream(fis);
                try{
                    Square s2=(Square)ois.readObject();
                    s2.calcArea();
                    System.out.println("Perimeter is "+s2.calcPerimeter());
                    fis.close();
                    ois.close();
                }catch(Exception e){
                    System.out.println(e);
                }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
