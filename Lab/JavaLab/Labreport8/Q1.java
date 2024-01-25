/*
1.	Demonstrate an example of Generics Class?
 */
package Labreport8;
class School<T,U>{
    private T x;
    private U y;
    public School(T x, U y){
        this.x=x;
        this.y=y;
    }
    public T frist(){
        return x;
    }
    public U second(){
        return y;
    }
}

public class Q1 {
    public static void main(String[] args) {
        School <Integer, String >s1= new School<Integer, String>(1,"Hello");
        System.out.println(s1.frist());
        System.out.println(s1.second());
    }
    
}
