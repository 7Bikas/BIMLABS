/*
4.	Demonstrate and example of wild card in generics 
(Upper Bound type, Lower bound type and unbound type).
 */
package Labreport8;
import java.util.*;
// For Lower Bound
class Lower{
    public void displayLower(ArrayList <? super Integer>l1){
            System.out.println(l1);
        }
}
// For Upper bound
class Upper{
    public void displayUpper(ArrayList <? extends Number>a1 ){
        for(Number b:a1){
            System.out.println(b);
        }
    }
}

// Unbounded


public class Q4 {
    public static void main(String[] args) {
        Upper u1 = new Upper();
        ArrayList <Integer> a1 = new ArrayList<>();
        for(int i=1;i<5;i++){
            a1.add(i);
        }
        u1.displayUpper(a1);
        Lower l = new Lower();
        ArrayList <Integer> l1 = new ArrayList<>();
        for(int i=1;i<5;i++){
            l1.add(i);
        }
        l.displayLower(l1);
        
    }
}
