
package Orchid;
import java.util.*;
class Upper{
    public void display(List<? extends Number >l1){
        System.out.println(l1);
    }
}
public class UpperBound {
    public static void main(String[] args) {
        Upper u1= new Upper();
        ArrayList<Number> num= new ArrayList<>();
        num.add(10);
        num.add(5.5);
        num.add(7.8f);
        u1.display(num);
    }
    
}
