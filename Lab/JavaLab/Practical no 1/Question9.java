/*WAP to check wheather input given by user is prime or  composit */
import java.util.Scanner;
 public class Question9 {
    public static void main(String[] args) {
        int num, i,flag=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number: ");
        num=sc.nextInt();
        sc.close();
        for(i=2;i<num;i++){
            if(num%i == 0){
                flag++;
                break;
            }
        }
      if(flag==1){
        System.out.println(num+" is a Composit. ");
      }
      else{
        System.out.println(num+" is a prime. ");
      }
    }
}
