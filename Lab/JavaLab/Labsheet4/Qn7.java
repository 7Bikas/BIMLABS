/*
Create a String array that holds name of 5 birds and print the name of such birds whose 
first letter start with ‘s’.
 */
package Labsheet4;

import java.util.*;
public class Qn7 {
    public static void main(String[] args) {
        String []arr= new String[5];
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of 5 birds :");
        for(int i=0; i<5;i++){
            arr[i]=sc.next();
    }
        System.out.println("Name of birds starys with 's':");
        for(int i=0;i<5;i++){
        if(arr[i].charAt(0)=='s'||arr[i].charAt(0)=='S'){
            System.out.println(arr[i]);
        }
        }  
}
}
