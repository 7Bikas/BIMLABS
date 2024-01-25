package Practicalno2.Practicalno3;
class Rectangle{
     int length;
     int breadth;
    public Rectangle(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }    
     public int computeArea(){
        return(length*breadth);   
    }
    public void displayArea(){
        System.out.println("The area of rectangle is :"+(computeArea()));
    }
}
public class Qn4 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(6,7);
        r1.displayArea();
        Rectangle r2= new Rectangle(5,10);
        r2.displayArea();
    }
    
}
