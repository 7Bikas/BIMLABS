package Labsheet6;

/**2.	Create an interface Shape with methods get_data() that returns the value of instance variable and calArea() 
 * that returns the area. Create two classes Square and Rectangle which implements this interface with proper 
 * instance variable and constructor as per requirement.Now create a class Lab2Demo with main method that
 * creates instance of square and rectangle and demonstrate interface implementation by classes.
 */
interface Shape {
    int[] get_data();
    int calcArea();
}
class Square implements Shape{
    int []side=new int[1];
    public Square(int[] side){
        this.side=side;
    }
    @Override
    public int[] get_data() {
        return side;
    }

    @Override
    public int  calcArea() {
        int[] sq= new int[1];
        sq=get_data();
        return(sq[0]*sq[0]);
    }
    
}
class Rectangle implements Shape{
    int l[]= new int[2];
    public  Rectangle(int l[]){
        this.l=l;
    }
    @Override
    public int [] get_data() {
        return l;
    }

    @Override
    public int calcArea() {
        int[] area= new int[2];
        area=get_data();
        return(area[0]*area[1]);
    }
    
}

public class Lab2Demo {
    public static void main(String[] args) {
        int [] a=new int[1];
        a[0]=5;
        Square s1 =new Square(a);
        int f=s1.calcArea();
        System.out.println("Area of square is : "+f);
        int [] b=new int[2];
        b[0]=5;
        b[1]=4;
        Rectangle r1= new Rectangle(b);
        int ans=r1.calcArea(); 
        System.out.println("Area of rectangle is : "+ans);
    }   
}
