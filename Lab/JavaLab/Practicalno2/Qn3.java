package Practicalno2;
/*Solve the following using ternary operator :
 a.Read a  number from  user and print wherther that number is odd or even
 b. Read number from user and print wheather that number is positive or negative 
 c. Read threee number from user and find the greatest of three
 */
import java.util.Scanner;
public class Qn3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        //weather the number is odd or even 
        System.out.println("Enter a number to check odd or even ");
        int n1=sc.nextInt();
        
        String s1=(n1%2==0)?"Even":"Odd";
        System.out.println(n1+" is "+s1);
        //Wheather the number is positive or negative 
        System.out.println("Enter a number :");
        int n2=sc.nextInt();
        
        String s2=(n2>0)?"Positive":"Negative";
        System.out.println(n2+" is "+s2);
        //greatest among three 
        System.out.println("Enter three digit");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int g=(a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println(g+" is greatest .");
        sc.close();
    }
    
}
