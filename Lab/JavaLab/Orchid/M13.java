
package Orchid;

class Overloading{
    public void display(){
        System.out.println("This is empty ");
    }
    public void display(int x, int y){
        System.out.println("sum is "+(x+y));
    }
    public void display(int x, int y, int z){
        System.out.println("Sum is "+(x+y+z));
    }
}
public class M13 {
    public static void main(String[] args) {
        Overloading o1=new Overloading();
       o1.display();
       o1.display(5, 7);
       o1.display(77, 8, 90);
    }
}
