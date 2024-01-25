package Practicalno2.Practicalno3;
class Shape{
    int length,breadth,height;
    public Shape(){
        length=0;
        breadth=0;
        height=0;
    }
    public Shape (int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Shape(int length,int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
   public void calcRectangle(){
    System.out.println("Area o rectangle is "+(length*breadth)+"Sq meter.");
   }
   public void calcVolumeBox(){
    System.out.println("Volume of box is "+(length*breadth*height)+"meter cube");
   }
}
public class Qn8 {
public static void main(String[] args) {
    

        Shape rectangle= new Shape(5,7);
        rectangle.calcRectangle();
        Shape Box=new Shape(4,5,3);
        Box.calcVolumeBox();
    }
}
    

