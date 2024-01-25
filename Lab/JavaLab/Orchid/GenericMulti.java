
package Orchid;
class Box<T,U,W>{
    T length;
    U breadth;
    W height;
    public Box(T length, U breadth, W height){
    this.length= length;
    this.breadth= breadth;
     this.height= height;
}
    public T getLength(){
        return length;
    }
    public U getBreath(){
    return breadth;
    }
    public W getHeight(){
        return height;
    }
}

public class GenericMulti {
    public static void main(String[] args) {
        Box <Integer , Integer, Integer> b1= new Box<>(2,4,5);
        Integer l=b1.getLength();
        Integer b= b1.getBreath();
        Integer h=b1.getHeight();
        System.out.println("Volume is "+(l*b*h));
    }
    
}
