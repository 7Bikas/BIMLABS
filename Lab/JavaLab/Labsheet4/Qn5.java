/* Create a class Student having data member roll, name, address, faculty, grade(string). 
Create suitable constructor to set the details of student and methods findDivision() 
that calculates the division of student based on grade achieved and return the 
division( if grade=A+ then distinction, if grade=A then very good, grade B+ then first 
division, grade B then second division , grade C then pass in individual subject and if 
grade D the fail), display() method that display the student details and also display the 
division achieved by the student in main method. Now create the instance of two 
students and demonstrate the above scenario
 */
package Labsheet4;
class Student{
    int roll;
    String address;
    String faculty;
    String grade;
    public Student(int roll, String address, String faculty, String grade){
        this.roll=roll;
        this.address=address;
        this.faculty=faculty;
        this.grade=grade;
    }
    public String  findDivision(){
        if (grade == "A+"){
        return "Distinction";
    }
        else if(grade == "A"){
                return "Very good";
                }
        else if (grade == "B+"){
                return "First Division";
        }
        else if (grade == "B"){
            return "Second Division ";
        }
        else if(grade == "C"){
            return "Pass in individual subject " ;
        }
        else {
            return "Fail";
        }
        }
    public void display(){
        System.out.println("Roll  no is "+roll);
        System.out.println("Address :"+address);
        System.out.println("Faculty :"+faculty);
        System.out.println("Grade :"+grade);
    }
}
public class Qn5 {
    public static void main(String[] args) {
        Student s1 =new Student(1,"Gorkha","BIM","A+");
        System.out.println("Division :"+s1.findDivision());
        s1.display();
        Student s2= new Student(2,"Kavre","BIM","A+");
        System.out.println("Division :"+s2.findDivision());
        s2.display();
    }
    
}
