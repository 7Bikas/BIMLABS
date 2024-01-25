
package practice;
import java.util.Scanner;

public class SecondLrgest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp;
        int a[]=new int [10];
        System.out.println("Enter the element of array : ");
        for (int i=0;i<a.length;i++){
          a[i]=sc.nextInt();
        }    
        for (int i=0; i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
              if(a[i]>a[j]){
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }  
            }
        }
        int index =a.length-2;
        System.out.println("Second largest element is : "+a[index]);
    }
}
