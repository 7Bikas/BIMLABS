package Labsheet6;
/*1.	Create an interface Num with two method int add(int x, int y) and void mul(int x, int y)then make a class Sol that implements Num. 
finally create a class LabDemo with main method and demonstrate the interface implementation.*/
interface Num{
    int add(int x, int y);
    void multi(int x, int y);
}
class Sol implements Num{

    @Override
    public int add(int x, int y) {
        return(x+y);
    }

    @Override
    public void multi(int x, int y) {
        System.out.println("Multiplication  is "+x*y);
    }

}
public class LabDemo {
    public static void main(String[] args) {
        Sol s1 = new Sol();
       int ad= s1.add(70, 80);
        System.out.println("Sum is "+ad);
        s1.multi(20, 10);
    }
    
}
