package Recursion;

import java.util.Scanner;
public class GCDRecursion {
    int num1, num2,result;
    GCDRecursion(){
        num1=0;
        num2=0;
        result=0;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        result = gcd(num1,num2);
        display();
        sc.close();
    }
    public int gcd(int x, int y){
        if(x==0)
            return y;
        return gcd(y%x , x);
    }
    public void display(){
        System.out.println("Gcd of "+num1 +" and "+num2+" is: "+result);
    }
    public static void main(String[] args) {
        GCDRecursion g1 = new GCDRecursion();
        g1.input();
    }
}
