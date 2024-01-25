
package Orchid;
import java.util.*;
class Student{
    private String name ;
    private double per;
    public Student(String name, double per){
        this.name =name;
        this.per= per;
    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Percentahe :"+ per);
    }
    public String Name(){
        return name;
    }
    public double percent(){
        return per;
    }
}
public class M18 {
    public static void main(String[] args) {
        Student s1= new Student("Bikas",80);
        Student s2= new Student("hari",90.8);
        Student s3= new Student ("Nabin",99.0);
        Student s4= new Student ("Rohan", 78);
        Student s5= new Student("Manjesh",70);
        List<Student>Students = new ArrayList<>();
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Students.add(s4);
        Students.add(s5);
        Student highest_marks=Students.get(0);
        for(Student std:Students){
            if(std.percent()>highest_marks.percent()){
                highest_marks=std;
            }
        }
        System.out.println("Name :"+highest_marks.Name());
    }
    
}
