/*5.	Show the use of finally keyword in exception handling with an example*/
package Labsheet7;

public class Qn5 {
    public static void main(String[] args) {
      try{
            int a=100/0;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }finally{
            System.out.println("Code after error is Hello ");
        }  
    }
}
