package Recursion;
import java.util.Scanner;
public class Factorial {
    int n;
    int result;
     Scanner sc= new  Scanner(System.in);
    void input(){
        System.out.println("Enter a number :");
        n=sc.nextInt();
        result=fact(n);
        display();
    }
    int fact(int n){
        if(n==0)
        return 1;
        return n*fact(n-1);
    }
    void display (){
       System.out.println("Factorial of "+n+" is :"+result);
    }
    public static void main(String[] args) {
       Factorial fa= new Factorial();
       fa.input(); 
    }
}
