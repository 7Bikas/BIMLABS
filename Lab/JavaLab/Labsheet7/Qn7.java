/*
7.	Write a program to create a class name Person with attribute name and age with method setName() 
to set the name and setAge() to set the age of a person. Throw your own exception when the user gives
age value rather than between 1 to 100. */
package Labsheet7;
class NegativeAge extends Exception{
 @Override
 public String toString(){
     return"Age cannot be negative and more than 100";
 }
}
class Person{
    String name;
    int age;
    public void setName(String name){
        this.name=name;
        System.out.println("Your name is :"+name);
    }
    public void setAge(int age)throws NegativeAge{
        this.age=age;
        if(age<1 || age>100){
            throw new NegativeAge();
        }
        else{   
            System.out.println("Your age is "+age);
        }
    }
}

public class Qn7 {
    public static void main(String[] args) {
       Person p1= new Person();
         p1.setName("Bikas");
       try{
           p1.setAge(-5);
       }catch(NegativeAge na){
           System.out.println(na);
       }
    }  
}
