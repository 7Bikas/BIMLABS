class Calculator {
public void calculation (){
    System.out.println("This is empty");
}
public void calculation(int a,int b){
    System.out.println(a*b);
}
public void calculation(double a,double b){
    System.out.println(a+b);
}
public int calculation(int a,int b,int c){
    return(a-b-c);}
}public class MethodOverloadingDemo{
    public static void main(String []args){
        Calculator c1=new Calculator();
        c1.calculation();
        c1.calculation(55,42);
        c1.calculation(5.6,6.8);
       int d=c1.calculation(9,3,2);
       System.out.println(d);
    }
}