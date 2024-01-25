/*
4.	Show an example of throw and throws.
*/
package Labsheet7;
class ThrowExample{
   public void multiply(int a, int b)throws ArithmeticException{
      if(a==0 || b==0){
          throw new ArithmeticException("While multiplying by zero answer will be zero.");
      }
      else {
          int ans =a*b;
          System.out.println("Multiplication is :"+ans);
      }
   }
        
}
public class Qn4 {
    public static void main(String[] args) {
        ThrowExample t1= new ThrowExample();
        try{
            t1.multiply(7, 0);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
    
}
