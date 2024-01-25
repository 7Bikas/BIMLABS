
package Orchid;

interface Shape{
    public void area();
    public void perimeter();
}
class Circle implements Shape{
     double r;  
     public Circle(double r){
         this.r=r;
     }
     double pi=3.1416;
    @Override
    public void area() {
        System.out.println("Area of circle is "+(pi*r*r));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is "+(2*pi*r));
    }
    
}
class Rectangle implements Shape{
    int len;
    int bth;
    public Rectangle(int len, int bth){
        this.len=len;
        this.bth=bth;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle ="+(len*bth));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle is "+(2*(len+bth)));
    }
     
    
}
public class M17 {
    public static void main(String[] args) {
        Circle c1= new Circle (4);
        c1.area();
        c1.perimeter();
        Rectangle r1= new Rectangle(4,5);
        r1.area();
        r1.perimeter();
    }
    
}
