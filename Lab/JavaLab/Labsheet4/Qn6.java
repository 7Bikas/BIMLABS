/*
6. How static polymorphism is achieved in java? Show a program
 */
package Labsheet4;
class Polaymorphhism {
    public void area(int l, int b){
        System.out.println("Area of rectangle is "+l*b);
    }
    public int area(int l){
        return l*l; 
    }
    public double area(double a, double b){
        return 2*(a+b);
    }
}
public class Qn6 {
    public static void main(String[] args) {
        Polaymorphhism p1 =new Polaymorphhism();
        int a1=p1.area(4);
        System.out.println("Area of squarer is "+a1);
        System.out.println("Perimeter of rectangle is :"+p1.area(2.1,3.1));
        p1.area(5, 6);
        
        
    }
}
    
