
package Orchid;
import java.io.*;

class Employee implements Serializable{
    int id ;
    String name ;
    public Employee (int id, String name ){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Id :"+id);
    }   
}
public class SerilizationDemo {
    public static void main(String[] args) {
       try{
           File f1= new File ("seri.txt");
           if(!f1.exists()){
               f1.createNewFile();
           }
        Employee e1= new Employee(5, "Rahul");
        FileOutputStream fos = new FileOutputStream(f1);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(e1);
        System.out.println("Objext has written sucessfully");
        
       } catch(IOException e){
           System.out.println(e);
       }
    }
    
}
