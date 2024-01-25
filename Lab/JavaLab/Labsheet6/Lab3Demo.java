 /*3.	Create an interface called Numbers with two methods int square(int x) that returns the square 
of a number passed on parameter and void cube(int x) that display the cube of a number 
passed on parameter. Now, create a class NumbersDemo that implements Numbers and 
overrides the method of interface. Finally create a class Lab3Demo with main methods and 
demonstrate the interface implementation.
 */
package Labsheet6;
interface Number{
    int Square(int x);
    void Cube(int x);
}
class NumbersDemo implements Number{

    @Override
    public int Square(int x) {
        return(x*x);
    }

    @Override
    public void Cube(int x) {
        System.out.println("Cube is :"+x*x*x);
    }
    
}
public class Lab3Demo {
    public static void main(String[] args) {
        NumbersDemo n1= new NumbersDemo();
       int a= n1.Square(5);
        System.out.println("Square is :"+a);
       n1.Cube(5);
    } 
}
