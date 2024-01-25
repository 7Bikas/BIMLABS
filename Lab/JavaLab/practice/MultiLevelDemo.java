class Student{
    private int roll;
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void displayRoll(){
        System.out.println(roll);
    }
}
class Test extends Student{
    private int ob;
    private int hm;
    public void setMarks(int ob, int hm){
        this.ob=ob;
        this.hm=hm;
    }
    public void displayMarks(){
        System.out.println("You got"+ob+"marks in ob&hrm"); 
        System.out.println("You got"+hm+"marks in hm"); 
    } 
    public int getob(){
        return ob;
    }
    public int gethm(){
        return hm;
    }
}
class Result extends Test{
    private int total;
    public void setTotal(int x,int y){
        total=x+y;
    }
    public void displayTotal(){
      System.out.println("Your total marks is "+total) ; 
    }
}
public class MultiLevelDemo{
    public static void main(String []args){
        Result r1=new Result();
        r1.setRoll(1);
        r1.displayRoll();
        r1.setMarks(99,86);
        r1.displayMarks();
        int ob=r1.getob();
        int hm=r1.gethm();
        r1.setTotal(ob,hm);
        r1.displayTotal();
    }
}