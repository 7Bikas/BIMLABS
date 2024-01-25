/*
1.Show an example of try catch by handling any two exceptions.
 */
package Labsheet7;

public class Qn1 {
    public static void main(String[] args) {
        try{
            int a=10/0;
            int []b=new int[4];
            b[5]=4;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);}
    }
    
}
