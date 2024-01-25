
package MISc;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= sc.nextInt();
        int rev=0;
        //System.out.println("Reverse of given nuber is :");
       /*while(num>0){
            int rem = n%10;   
            System.out.print(rem);
            n=n/10;
        }*/
       while(num!=0){
          int rem=num%10;
          rev=rev*10+rem;
          num=num/10;   
       }
       System.out.println("Reverse of given nuber is :"+rev);
    }
    
}
