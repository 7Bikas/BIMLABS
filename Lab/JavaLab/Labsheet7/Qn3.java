/*
3.	Show an example of nested catch statement
 */
package Labsheet7;
public class Qn3 {
    public static void main(String[] args) {
        try{
            int a=100/0;
            try{
                int [] b= new int[10];
                b[20]=200;
            }catch(ArrayIndexOutOfBoundsException ai){
                System.out.println(ai);
            }
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
    }
    
}
