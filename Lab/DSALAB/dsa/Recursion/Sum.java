package Recursion;
import java.util.Scanner;
public class Sum {
    Scanner sc= new Scanner(System.in);
    int num1, num2,res;
    void input(){
        System.out.println("Enter any two  number :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        res=add(num1, num2);
        display();
    }
    int add(int num1, int num2){
        if(num2==0){
            return num1;
        }else{
            return add(num1+1 ,num2-1);
        }
    }
    void display(){
        System.out.println("Sum of "+num1+" and "+num2+" is "+res);
    }
    public static void main(String[] args) {
        Sum sm= new Sum();
        sm.input();
    }
}
