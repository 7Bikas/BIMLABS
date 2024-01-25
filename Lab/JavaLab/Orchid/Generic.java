
package Orchid;

class GenericDemo<T>{
    T x;
    public GenericDemo(T x){
        this.x= x;
    }
    public void display(){
        System.out.println(x);
    }
    
}
public class Generic {
    public static void main(String[] args) {
       GenericDemo <Integer> g1= new GenericDemo<>(7);
    g1.display();
    GenericDemo <String> g2= new GenericDemo<>("Haribahadhur");
    g2.display();
    
     
    }
    
}
