
package Labsheet4;

class Work{
    public void calculate(int a, int b){
        System.out.println("Sum is "+(a+b));
}
    public double calculate(double a, double b, double c){
      return (a*b*c);
    }
    public void calculate(float a, float b){
        System.out.println("Difference is "+(a-b));
    }
    }   
public class Qn1 {
    public static void main(String[] args) {
        Work w1= new Work();
        w1.calculate(10, 50);
        System.out.println("Multiplication is "+w1.calculate(3.4, 34.4, 9.2));
        w1.calculate(15.5f, 5.5f);
    }
    
}
