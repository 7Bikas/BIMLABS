
package Orchid;
class ConsOverLoad{
    int a, b;
    String x;
    public ConsOverLoad(){
        System.out.println("This is default constructor");
    }
    public ConsOverLoad(int a, int b){
      this.a=a;
      this.b=b;
        System.out.println("sum is "+(a+b));
    }
    public ConsOverLoad(String x){
        this.x=x;
        System.out.println("This is parameteraise constructor ");
    }
    
}
public class Qn18 {
    public static void main(String[] args) {
        ConsOverLoad c1= new ConsOverLoad();
        ConsOverLoad c2= new ConsOverLoad(4,5);
        ConsOverLoad c3= new ConsOverLoad("Bikas");
    }
    
}
