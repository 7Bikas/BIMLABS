package Practicalno2;
//WAP to using switch case to print the day depending upon number inputed by user.
//(If input is 2 print monday and so on)
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number (1-7)");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thrusday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid number try aganin!!!!");
        }
        sc.close();
    }
    
}
