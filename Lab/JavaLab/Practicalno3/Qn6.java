package Practicalno2.Practicalno3;
class Box {
    private int length,breadth,height;
    public Box(int length, int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    public int computeVolume(){
        return(length*breadth*height);
    }
}

public class Qn6 {
    public static void main(String[] args) {
        Box p1=new Box(9,5,3);
        int res=p1.computeVolume();
        System.out.println("Volume of box is "+res);
        Box p2=new Box(12,9,5);
        int out=p2.computeVolume();
        System.out.println("Volume of box is "+out);
    }
    
}
