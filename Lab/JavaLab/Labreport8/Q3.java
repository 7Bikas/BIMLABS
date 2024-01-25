/*
3.	Demonstrate an example of Bound type in generics
 */
package Labreport8;
class NumberAccept<T extends Number>{
    T obj;
    public NumberAccept(T obj){
    this.obj=obj;
    }
    public void display(){
        System.out.println("Value is :"+this.obj);
    }
}
public class Q3 {
    public static void main(String[] args) {
        NumberAccept <Integer> n1= new NumberAccept<>(30);
        n1.display();
    }
    
}
