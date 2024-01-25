
package Orchid;
import java.util.*;
class Employee{
    String name;
    int age;
    double salary;
   public void setData(String name , int age, double salary){
       name=this.name;
       age=this.age;
       salary=this.salary;
   }
   public String Name(){
       return name;
   }
   public  int Age(){
       return age;
   }
   public double Salary(){
       return salary;
   }
}
public class Qn16 {
    public static void main(String[] args) {
       Employee e1= new Employee();
       Employee e2= new Employee();
       Employee e3= new Employee();
       e1.setData("Hari", 20, 50000.5);
       e2.setData("Nabin", 19, 60000.8);
       e3.setData("Rohan", 20, 70000.9);
       //yo array list banako only accept object
       List<Employee>employees=new ArrayList<>();
       employees.add(e1);
       employees.add(e2);
       employees.add(e3);
       //Finding highest paid employee
       Employee highestPaid=employees.get(0);
       for(Employee emp:employees){
           if(emp.Salary()>highestPaid.Salary()){
               highestPaid=emp;
           }
       }
       //displaying
        System.out.println("DIsplaying the highest paid salary:");
        System.out.println("Name :"+highestPaid.Name());
         System.out.println("Age :"+highestPaid.Age());
          System.out.println("Salary :"+highestPaid.Salary());
    }
}
