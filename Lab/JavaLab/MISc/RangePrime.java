
package MISc;

import java.util.*;
public class RangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,i,j,flag=0;
        System.out.println("Enter the two number  number :");
         a=sc.nextInt();
         b=sc.nextInt();
        System.out.println("Prime number from "+a+"to "+b+"are :");
        for( i=a;i<b;i++){
          for( j=2;j<i;j++){
              if(i%j==0){
                 flag=1;
                 break;
              }
          }
          if (flag==0){
              System.out.print(i+",");
          }
          flag=0;
        }
    }
   
}
