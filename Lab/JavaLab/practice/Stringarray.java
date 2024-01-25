/*
WAP to create String array of size 'n' and prompt the user 
to insert 'n ' names in it. Then you are requirted to replace 
all 'i' with '!' and display it 
 */
package practice;

import java.util.Scanner;
public class Stringarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of  array :");
        int n=sc.nextInt();
        String []arr= new String[n];
        System.out.println("Enter "+n+"names :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        for(int i=0;i<arr.length;i++){
        arr[i]=arr[i].replace('i', '!');
    }
        System.out.println("After replacing 'i' with '!' :");
        for (String arr1 : arr) {
            System.out.println(arr1);
        }
        sc.close();
    }
    
}
