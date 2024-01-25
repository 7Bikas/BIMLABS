/*
6.	Create a abstract class Rectangle having instance variable length and breadth both 
in int with constructor to set that instance variables, one normal method calcArea() that
prints the area of Rectangle and abstract method int calcPerimeter() that returns the perimeter
of rectangle. Create a class Box that inherits abstract class Rectangle having 
instance variable l, b and h with constructor to initialize the instance variable and 
calcVolume to print the volume of Box. Now create a class Lab6Demo with main method and d
emonstrate implementation of abstract class.
 */
package Labsheet6;
abstract class  Rectangle{
int length, breadth;
public Rectangle(int length,int breadth){
    this.length= length;
    this.breadth=breadth;
}
public void calcArea(){
    System.out.println("Area of rectangle is : "+(length*breadth));
}
abstract int calcPerimeter();
}
class Box extends Rectangle{
    int l,b,h,length,breadth;
    public Box(int l, int b, int h, int length, int breadth){
        super(length,breadth);
        this.length=length;
        this.breadth=breadth;
        this.b=b;
        this.h=h;
        this.l=l;
    }
    public void calcVolume(){
        System.out.println("Volume of box is :"+(l*b*h));
    }
    @Override
    public int calcPerimeter() {
        int per=2*(length+breadth);
        return per;
    }
}
public class Lab6Demo{
    public static void main(String[] args) {
        Box b1 =new Box(3,4,5,3,4);
        b1.calcArea();
       int a= b1.calcPerimeter();
        System.out.println("Perimeter of rectangle is : "+a);
        b1.calcVolume();
    }   
}