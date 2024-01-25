package Practicalno2.Practicalno3;
class Numbers{
    int x,y,z;
    public Numbers(int x, int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public int getMax(){
        if(x>y && x>z){
            return(x);
        }
        else if(y>x && y>z){
            return(y);
        }
        else{
            return(z);
        }
    }
}
public class Qn5 {
    public static void main(String[] args) {
        Numbers n1 =new Numbers(4,7,9);
        int res= n1.getMax();
        System.out.println("Greatest number is "+res);
    }
    
}
