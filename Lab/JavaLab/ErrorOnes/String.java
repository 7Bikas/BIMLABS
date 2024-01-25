
package ErrorOnes;

import java.util.Scanner;

public class String {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");  
      int n=sc.nextInt();
      String []arr= new String[n];
      System.out.println("Enter "+n+"names :");
      for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
      }
      sc.close();
      for(int i=0;i<arr.length;i++){
        arr[i]=arr[i].replace('i','!');
      }
      System.out.println("After replacing i with '!' :");
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
    }
    
}
