/*
Write a java program that asks the user to enter number in array of size 'n'. 
Then display omly the number that are  divisible by 2 and 3.
 */
package Labsheet4;

import java.util.Scanner;
public class Qn2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
         int []arr=new int [n];
         System.out.println("Enter "+n+" number :");
         for(int i =0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Number divisiblre by 2  and 3 are :");
         for (int i=0;i<n;i++){
             if(arr[i]%2==0 && arr[i]%3==0){
                 System.out.print(arr[i]+", ");
         }
    }  
}
}
