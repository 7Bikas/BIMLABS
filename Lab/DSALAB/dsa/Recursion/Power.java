package Recursion;
import java.util.Scanner;
public class Power {
    int num1, num2 , result;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        num1 = sc.nextInt();
        System.out.println("Enter the value of y: ");
        num2 = sc.nextInt();
        result = pow(num1,num2);
        display();
        sc.close();
    
    }
    public int pow(int x, int y){
        if(y==0){
            return 1 ;
        }else{
            return (x*pow(x,y-1));
        }
    }
    public void display(){
        System.out.println("X ^ Y is: "+result);
    }
    public static void main(String[] args) {
        Power p1 = new Power();
        p1.input();
    }
}
