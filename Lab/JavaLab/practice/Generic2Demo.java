
package practice;
class Box<T,U,W>{
    private T length;
    private U breadth;
    private W height;
    public Box (T length, U breadth, W height){
        this.length= length;
        this.breadth=breadth;
        this.height= height;
    }
    public void displayBox(){
        System.out.println("Length is : "+length);
        System.out.println("Breadth is : "+breadth);
        System.out.println("Height is : "+height);
    }
    public T getlen(){
        return length;
    }
    public U getBreadth(){
        return breadth;
    }
    public W getHeight(){
        return height;
    }
}
public class Generic2Demo {
    public static void main(String[] args) {
        Box<Integer, Integer, Integer>b1=new Box<Integer, Integer, Integer>(3,4,5);
        Integer l=b1.getlen();
        Integer b=b1.getBreadth();
        Integer h=b1.getHeight();
        System.out.println("Volume of Box is : "+(l*b*h));
    }
}
