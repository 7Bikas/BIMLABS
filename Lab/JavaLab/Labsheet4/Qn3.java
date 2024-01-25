/*
Make an array of integers of size 30 and store 30 integer in it then display 
the integers 
that are between 16 and 47;
 */
package Labsheet4;
import java.util.Scanner;
public class Qn3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []a= new int[30];
        System.out.println("Enter 30 numbers :");
        for(int i=0;i<30;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Numbers between 16 to 47 are:");
        for(int i=0;i<30;i++){
          if(a[i]>16 && a[i]<47){
                System.out.print(a[i]+", ");
            }
        }
    }   
}
