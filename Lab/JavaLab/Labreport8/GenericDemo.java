
package Labreport8;
class Shape<T>{
    private T roll;
    public Shape(T roll){
        this.roll=roll;
    }
    public void display(){
        System.out.println("Your roll no is : "+roll);
    }
}
public class GenericDemo {
    public static void main(String[] args) {
 //<editor-fold defaultstate="collapsed" desc="comment">
//</editor-fold>
        Shape <Integer> s1= new Shape <Integer>(3);
        s1.display();
    } 
}
