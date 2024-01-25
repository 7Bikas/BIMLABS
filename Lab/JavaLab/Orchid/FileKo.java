
package Orchid;
import java.io.*;
import java.util.*;
class Student{
    private String name ;
    private int per;
    public Student(String name , int per){
        this.per=per;
        this.name=name;
    }
    public void display(){
        System.out.println("Name of student is :"+name);
        System.out.println("Percentage : "+per);
    }
    
   public String Name(){
       return name;
   } 
   public int Per(){
       return per;
   }
}

public class FileKo {
    public static void main(String[] args) {
        Student s1= new Student("Bikas",90);
        Student s2= new Student("Hari",89);
        Student s3= new Student("Nabin",88);
        Student s4= new Student("Rohan",87);
        Student s5= new Student("Apson",86);
        Student s6= new Student("Abkit",85);
        Student s7= new Student("Aju",80);
        Student s8= new Student("Bibek",70);
        Student s9= new Student("Suraj",77);
        Student s10= new Student("Nikhil",60);
        List<Student> Students= new ArrayList<>();
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Students.add(s4);
        Students.add(s5);
        Students.add(s6);
        Students.add(s7);
        Students.add(s8);
        Students.add(s9);
        Students.add(s10);
        Student highest=Students.get(0);
        for(Student std:Students){
            if(std.Per()>highest.Per()){
                highest=std;
            }
        }
        System.out.println("Highest mark is of "+highest.Name());
    }
    
}
