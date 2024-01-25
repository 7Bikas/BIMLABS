import java.util.Scanner;
public class Prime{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number :");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        sc.close();
        System.out.println("Prime number from " +num1 +"to" +num2 +"are:");
        for(int i=num1;i<=num2;i++){
            int  count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i+"\t");
            }
        }
    }
}