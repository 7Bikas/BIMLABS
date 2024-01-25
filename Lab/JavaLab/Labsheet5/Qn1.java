/*
Provide an example of single inheritance of your choice. (Two child class inheriting 
single parent class)
 */
package Labsheet5;
class Parent{
   public void display(String name , String age){
              System.out.println("NAme :"+name);
              System.out.println("Age :"+age);
   }
}
class Child1 extends Parent{
    private String address;
    public Child1( String address){
        this.address=address;
    }
    public void address(){
        System.out.println("Address :"+address);
    }   
}
class Child2 extends Parent{
    private String grade;
    public Child2( String grade){
        this.grade=grade;
    }
    public void grade(){
        System.out.println("Grade :"+grade);
    }   
}
    
public class Qn1 {
    public static void main(String[] args) {
        Child1 c1= new Child1("Gorkha");
        c1.address();
        c1.display("Bikas","20");
        Child2 c2= new Child2("A+");
        c2.grade();
        c2.display("Nabin","Panchkhal");
    }
    
}
