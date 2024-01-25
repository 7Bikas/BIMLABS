/*
Create an abstract class Calculation which has one normal method int add(int x, int y)
which will calculate the sum of x and y and return the results and one abstract method 
int mul (int x, int y) that performs multiplication. Create a class Demo that inherit 
abstract class that implement all the abstract method, and it have its own method int 
calcDiv(int x, int y) that calculates the division between x and y and return the result. 
Now create the object of Demo and demonstrate the above scenario. After this access 
the method of abstract class using reference of abstract class.
 */
package Labsheet4;
abstract class Calculation {
    public int add(int x, int y){
        return x+y;
    }
    abstract int mul(int x, int y);
}
    class Demo extends Calculation{
        public int calcDiv(int x, int y){
            return x/y;
    }

    @Override
    int mul(int x, int y) {
        return x*y;
    }
        
    }
public class Qn8 {
    public static void main(String[] args) {
        Demo d1= new Demo();
        System.out.println("Division is :"+d1.calcDiv(20, 5));
        System.out.println("Multipllication is "+d1.mul(4, 5));
        int v= d1.add(30, 70);
        System.out.println("Sum is :"+v);
        Calculation c1;
        c1= d1;//upcasting 
        System.out.println("Multipllication is "+c1.mul(44, 5));
        System.out.println("Sum is :"+c1.add(456, 4));
    }
    
}
