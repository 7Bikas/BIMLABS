package Recursion;
import java.util.Scanner;
public class SumOfN {
    Scanner sc =new Scanner (System.in);
    int n, res;
    void input(){
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        res=sum(n);
        display();
    }
    int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
            
        }
    }
    void display(){
        System.out.println("Sum of  "+n+" number is "+res);
    }
    public static void main(String[] args) {
        SumOfN sn= new SumOfN();
        sn.input();
    }
}
