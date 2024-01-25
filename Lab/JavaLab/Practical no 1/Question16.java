import java.util.Scanner;
public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2 ");
        int ch1=sc.nextInt();
        switch(ch1){
            case 1:
            System.out.println("Choose one  BBA, BIM, or BCA");
            String ch2=sc.next();
            switch(ch2){
                case "BBA":
                System.out.println("Total charege of BBA course is Rs 450000");
                break;
                case "BIM":
                System.out.println("Total charge of BIM course is RS 560000");
                break;
                case "BCA":
                System.out.println("Total charge of BCA course is Rs 500000");
                break;
                default:
                System.out.println("Invalid choice .");
            }
            break;
            case 2:
            System.out.println("Choose one BBS or BBM");
            String ch3=sc.next();
            switch(ch3){
                case "BBS":
                System.out.println("Total charge of BBS is Rs 275000");
                break;
                case "BBM":
                System.out.println("Total charge of BBM  is Rs 375000 ");
                break;
                default :
                System.out.println("Invalid input!!!!");

            }default :
            System.out.println("Invalid input!!!!");
            
             }
        sc.close();
    }
    
}
