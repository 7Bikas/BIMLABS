/*
5.	Write a program to demonstrate inheritance in interface (inheriting one interface by another)
 */
package Labsheet6;
interface First{
    void multi(int x, int y);
}
interface Second extends First{
    void div(int x, int y);
}
class Solution implements Second{

    @Override
    public void div(int x, int y) {
        System.out.println("Division is : "+(x/y));
    }

    @Override
    public void multi(int x, int y) {
        System.out.println("Multiplication is :"+(x*y));
    } 
}
public class InheritanceinInterface {
    public static void main(String[] args) {
        Solution s1= new Solution();
        s1.div(50, 5);
        s1.multi(5, 4);
    } 
}
