
package Orchid;
import java.util.*;
class Factorial{
    public int fact(int a){
        if(a==0){
            return 1;
        }
        else{
            return (a*fact(a-1));
        }
    }
}
public class M15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        Factorial f1= new Factorial();
        int f= f1.fact(n);
        System.out.println("Factorial of "+n+"is "+f);
    }
}
