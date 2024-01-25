/*
8.	Create a class Empolyee with data member id(int), name (String), gender (String), course (String). 
A class have one constructor to initialize the instance variable and method display () that prints the 
details of employee. Now, create a object of Employee and write it into a file “employee.txt” after that
access the object from employee.txt and access method of a class.  */
package Labsheet8;
import java.io.*;
class Employee implements Serializable{
    int id;
    String name;
    String gender;
    String course;
    public Employee(int id, String name , String gender, String course){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.course=course; 
    }
    public void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Course : "+course);
    }
}
public class Qn8 {
    public static void main(String[] args) {
        
        try{
            File f1= new File("employee.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream (f1);
            Employee e1 =new Employee(1,"Bikas","Male","BIM");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(e1);
            System.out.println("Object written to the file.");
            os.close();
            fos.close();
            FileInputStream fis = new FileInputStream ("employee.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            try{
                Employee e2=(Employee)ois.readObject();
                e2.display();
                
            }catch(Exception ex){
                System.out.println(ex);
            }
            ois.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
