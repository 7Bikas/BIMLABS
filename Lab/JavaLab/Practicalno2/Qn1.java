package Practicalno2;
import java.util.Scanner;
public class Qn1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Quotient = "+(a/b));
        System.out.println("Remainder ="+(a%b));
        sc.close();
    }
}