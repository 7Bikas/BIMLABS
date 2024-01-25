package Recursion;

import java.util.Scanner;

public class FibRecursion {
    static int n1 = 0, n2 = 1;
    
    static void printFibonacci(int count) {
        if (count > 0) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.print(n1 + " " + n2);
         printFibonacci(n - 2);
         sc.close();
    
    }
    
    public static void main(String[] args) {
        FibRecursion f1 = new FibRecursion();
        f1.input();
    }
}
