
package Orchid;

import java.util.*;
public class Qn11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size of array:");
        int n=sc.nextInt();
        int [] arr= new int[n];
        int i,sum=0;
        System.out.println("Enter the element of array:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum of odd number is : "+sum);
    }
}
