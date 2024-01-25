/*
4.	Write a program to demonstrate multiple inheritance condition using interface
 */
package Labsheet6;
interface Sum{
    void Add(int x, int y);
}
interface Subtract{
    void Sub(int x, int y);
}
class Maths implements Sum, Subtract{

    @Override
    public void Add(int x, int y) {
        System.out.println("Sum is : "+(x+y));
    }

    @Override
    public void Sub(int x, int y) {
        System.out.println("Difference  is : "+(x-y));
    } 
}
public class Multipleinterface {
    public static void main(String[] args) {
        Maths m1= new Maths();
        m1.Add(20, 30);
        m1.Sub(50, 20);
    }
    
}
