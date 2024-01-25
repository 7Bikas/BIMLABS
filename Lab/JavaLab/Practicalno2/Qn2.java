package Practicalno2;
import java.util.Scanner;
public class Qn2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any four digit:");
       int num=sc.nextInt();
       sc.close();
      
       int [] arr=new int[4];
       int rem, rev=0, sum=0, sumsq=0;
       int i=3;
       while(num!=0){
        rem=num%10;
        rev=rev*10+rem;
        sum+=rem;
        sumsq+=rem*rem;
        num=num/10;
        arr[i]=rem;
        i--;
       }
        System.out.println("Displaying each digit seperatly :");
       for(i=0;i<4;i++){
        System.out.println("Digit"+(i+1)+"="+arr[i]);
       }
       System.out.println("Sum  of each digit is "+sum);
       System.out.println("Reverse of given number is "+rev);
       System.out.println("Sum of square of each digit is "+sumsq);
    }
    
}
