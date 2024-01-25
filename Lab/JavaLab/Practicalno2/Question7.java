package Practicalno2;
/*WAp to calculate sum, multiplication, division,subtraction of two number 
 * based on user choice {hint : ask two number input from user and one choice from 
 * user and perform operation using switch case}
  */
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice \n1 for Sum\n2 for Multiplicatin\n3 for Division\n4 for Subtraction");
        int ch=sc.nextInt();
        sc.close();
        switch(ch){
            case 1:
            System.out.println("Your choice is 1 ");
            System.out.println("Sum of "+ a +" and "+ b+ " is "+(a+b));
            break;
            case 2:
            System.out.println("Your choice is 2 ");
            System.out.println("Multiplication of "+ a +" and "+ b+ " is "+(a*b));
            break;
            case 3:
            System.out.println("Your choice is 3 ");
            System.out.println("Division  of "+ a +" and "+ b+ " is "+(a/b));
            break;
            case 4:
            System.out.println("Your choice is 4 ");
            System.out.println("Subtraction  of "+ a +" and "+ b+ " is "+(a-b));
            break;
            default:
            System.out.println("Sorry invalid choice .");
        }
    }
    
}
