/*9.	  Create a class Calculate with two instance variable x and y both in int with one 
constructor to initialize the instance variable and methods int sum() that returns the sum
of x and y, void mul () that prints the multiplication of x and y, void findPrime() that
prints the prime no. between x to y. Now, write the object of calculate in file calc.txt,
after that read a object from that file and access the method of class. 
 */
package Labsheet8;
import java.io.*;
class Calculate implements Serializable{
    int x, y;
    public Calculate(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int SUm(){
        return(x+y);
    }
    public void mul(){
        System.out.println("Multiplication is : "+(x*y));
    }
    public void findPrime(){
        for(int i=x;i<y;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i+", ");
            }
        }
    }
}
public class Qn9 {
    public static void main(String[] args) {
       try{
           File f1= new File("calc.txt");
           if(!f1.exists()){
               f1.createNewFile();
           }
           //Serialization
           FileOutputStream fos = new FileOutputStream(f1);
           Calculate c1= new Calculate(5,15);
           ObjectOutputStream oos= new ObjectOutputStream(fos);
           oos.writeObject(c1);
           System.out.println("Object has been written..");
           oos.close();
           fos.close();
           //deserialization
           FileInputStream fis= new FileInputStream ("calc.txt");
           ObjectInputStream ois = new ObjectInputStream (fis);
           try{
               Calculate c2= (Calculate)ois.readObject();
               System.out.println("Sum is "+c2.SUm());
               c2.mul();
               c2.findPrime();
           }catch(Exception e){//ClassNOtFoundException
               System.out.println(e);
           }
           ois.close();
           fis.close();
       } catch(IOException e){
           System.out.println(e);
       }
    }
    
}
