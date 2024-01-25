/*
Create an abstract class Calculator having abstract methods calcPrime(int x, int y), 
calcEven(int x, int y). Now create a class SimpleCalculator that inherit an abstract class 
and provide the implementation of abstract method

 */
package Labsheet4;
abstract class Calculator{
abstract void calcPrime(int x, int y);
abstract void calcEven(int x, int y);
}
class SimpleCalculator extends Calculator{

    @Override
    void calcPrime(int x, int y) {
        System.out.println("\nPrime number are :");
        for(int i=x; i<y; i++){
            int flag=0;
           for (int j=2;j<i;j++){
               if (i%j==0){
                   flag++;
                   break ;    
               }
           }
           if (flag==0){
               System.out.print(i+", ");
           }
        }
       
    }

    @Override
    void calcEven(int x , int y)
{
        System.out.println("Even number are :");
        for(int i=x;i<=y;i++){
          if(i%2==0){  
              System.out.print(i+", ");
            }       
        }
    }
}

public class QN10 {
    public static void main(String[] args) {
        SimpleCalculator s1 =new SimpleCalculator ();
        s1.calcEven(10, 20);
        s1.calcPrime(10, 20);
    }
    
}
