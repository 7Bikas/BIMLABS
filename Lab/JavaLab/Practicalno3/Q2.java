package Practicalno2.Practicalno3;
class Calculate{
    private int num1;
    int num2;
    public void setCalc(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void calcSum(){
        System.out.println("Sum of "+num1 +" and "+num2+"is :"+(num1+num2));
    }
    public int calcMulti(){
      int  res=num1*num2;
      return(res);
    }
    public void calcDifference(){
        System.out.println("Difference 0f "+num1 +" and "+num2+"is :"+(num1-num2));
    }

}
public class Q2 {
    public static void main(String[] args) {
        Calculate c1= new Calculate();
        c1.setCalc(5, 3);
        c1.calcSum();
        c1.calcDifference();
        int r=c1.calcMulti();
        System.out.println("Multiplication is :"+r);
}
    
}
