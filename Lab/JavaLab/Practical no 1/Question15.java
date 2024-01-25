//WAP to demonstrate the switch statement and nested switch 
import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2:");
        int ch1 =sc.nextInt();
        switch(ch1){
            case 1:
            System.out.println("Choose  MOMO  or PIZZA");
            String ch2=sc.next();
            switch(ch2){
                case "MOMO":
                System.out.println("You order  MOMO . ");
                break;
                case "PIZZA":
                System.out.println("Your order will serve after five minute.");
                break;
                default:
                System.out.println("Invalid choice !!!");
            }
            break;
            case 2:
            System.out.println("Choose TEA or COFFEE");
            String ch3=sc.next();
            switch(ch3){
                case "TEA":
            System.out.println("Price of tea is Rs 40");
            break;
            case "COFFEE":
            System.out.println("Prce of COFFEE is Rs 100.");
            break;
            default:
            System.out.println("Sorry invalid option ");

            }
            default:
        System.out.println("Invalid choice");
        }
        sc.close();
    }
    
}
