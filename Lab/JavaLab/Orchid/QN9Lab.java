
package Orchid;
import java.util.*;
import java.io.*;
class Calculate {
    int x, y;
    public Calculate(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int sum(){
        return(x+y);
    }
    public void multi(){
        System.out.println("Multiplication of x and y is "+(x*y));
    }
    public void findPrime(){
        for(int i=x;i<=y;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                flag++;
                break;
                }
            }
            if(flag==0){
                System.out.print(i+",");
            }
        }    
    }
}
public class QN9Lab {
    public static void main(String[] args) {
        try{
            File f1= new File("Calculte.txt");
                  if(!f1.exists()){
                      f1.createNewFile();
                  }
                  FileOutputStream fos= new FileOutputStream(f1);
                  Calculate c1=new Calculate(3,4);
                  ObjectOutputStream oos= new ObjectOutputStream(fos);
                  oos.writeObject(c1);
                  System.out.println("Written sucessfully ");
                  oos.close();
                  fos.close();
                  FileInputStream fis= new FileInputStream ("Calculate.txt");
                  ObjectInputStream ois = new ObjectInputStream(fis);
                  try{
                      Calculate c2= (Calculate) ois.readObject();
                      System.out.println("Sum is "+c2.sum());
                      c2.multi();
                      c2.findPrime();
                  }catch(Exception e){
                      System.out.println(e);
                  }
                  ois.close();
                  fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
