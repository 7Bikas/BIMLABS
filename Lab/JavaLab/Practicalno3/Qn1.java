package Practicalno2.Practicalno3;
class Student{
    int roll;
    String name;
    String address;
    String gender;
    String faculty;
    public void setData(int roll,String name,String address,String gender,String faculty){
        this.roll=roll;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.faculty=faculty;
    }
    public void display(){
        System.out.println("Your roll no is : "+roll);
        System.out.println("Your name is : "+name);
        System.out.println("Your address is : "+address);
        System.out.println("Your gender is : "+gender);
        System.out.println("Your faculty is : "+faculty);
    }
}
public class Qn1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setData(1, "Bikas Bhatta" , "Gorkha", "Male", "BIM");
        s1.display();
        Student s2=new Student();
        s2.setData(2, "Nabin Upreti" , "Pachkhal", "Male", "BIM");
        s2.display();
    }
    
}
