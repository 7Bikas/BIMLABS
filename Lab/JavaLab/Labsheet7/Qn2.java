/*
2.	Show an example of multiple try catch statement
 */
package Labsheet7;

public class Qn2 {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("Division is "+c);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        try{
            int [] r= new int [5];
            r[10]=100;
        }catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
    }
    
}
