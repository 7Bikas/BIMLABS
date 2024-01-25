
package Orchid;
import java.util.*;
class Lower{
    public void display(List<?super Integer>l1){
        System.out.println(l1);
    }
}

public class LowerBound {
    public static void main(String[] args) {
      Lower l1= new Lower ();
      List<Integer> num= new ArrayList<>();
      num.add(22);
      num.add(10);
      l1.display(num);
      List <Number> num2=new ArrayList <Number>();
      num2.add(5.5);
      num2.add(5);
      l1.display(num2);
    }   
}
